import java.util.ArrayList;
import java.util.List;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem118 {
   public static void main(String[] args) {
      System.out.println(generate(5));
   }

   public static List<List<Integer>> generate(int numRows) {
      List<List<Integer>> out = new ArrayList<>();
      List<Integer> previous = new ArrayList<>();

      for (int i = 1; i <= numRows; ++i) {
         List<Integer> current = new ArrayList<>();

         for (int j = 1; j <= i; ++j) {
            if (j == 1 || j == i) {
               current.add(1);
            } else {
               int index = j -1;
               current.add(previous.get(index) + previous.get(index-1));
            }
         }
         out.add(current);
         previous = current;
      }
      return out;
   }
}
