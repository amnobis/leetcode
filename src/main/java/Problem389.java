import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem389 {
   public static void main(String[] args) {
      findTheDifference("abcde", "cdbeaf");
   }

   public static char findTheDifference(String s, String t) {
      String z = s+t;
      char out = 0;

      for (int i = 0; i < z.length(); ++i) {
         out ^= z.charAt(i);
      }

      return out;
   }
}
