import java.util.ArrayList;
import java.util.List;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem412 {
   public static void main(String[] args) {
      System.out.println(fizzBuzz(15));
   }

   public static List<String> fizzBuzz(int n) {
      List<String> out = new ArrayList<>();

      for (int i = 1; i <= n; ++i) {
         if (i % 15 == 0) {
            out.add("FizzBuzz");
         } else if (i % 3 == 0) {
            out.add("Fizz");
         } else if (i % 5 == 0) {
            out.add("Buzz");
         } else {
            out.add(String.valueOf(i));
         }
      }

      return out;
   }
}
