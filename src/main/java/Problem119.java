import java.util.ArrayList;
import java.util.List;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem119 {
   public static void main(String[] args) {
      System.out.println(generate(1));
   }

   public static List<Integer> generate(int rowIndex) {
      List<Integer> previous = new ArrayList<>();

      for (int i = 1; i <= rowIndex+1; ++i) {
         List<Integer> current = new ArrayList<>();

         for (int j = 1; j <= i; ++j) {
            if (j == 1 || j == i) {
               current.add(1);
            } else {
               int index = j -1;
               current.add(previous.get(index) + previous.get(index-1));
            }
         }
         previous = current;
      }
      return previous;
   }
}
