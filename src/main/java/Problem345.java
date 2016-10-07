import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem345 {
   public static void main(String[] args) {

   }

   public static String reverseVowels(String s) {
      Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u', 'A', 'E', 'I', 'O', 'U'));
      char[] str = s.toCharArray();


      for (int i = 0, j = s.length() -1; i < j;) {
         if (!vowels.contains(s.charAt(i) )) {
            ++i;
         } else if (!vowels.contains(s.charAt(j))) {
            --j;
         } else {
            char tmp = str[i];
            str[i] = str[j];
            str[j] = tmp;
            ++i;
            --j;
         }
      }
      return new String(str);
   }
}