import java.util.HashMap;
import java.util.Map;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem409 {
   public static void main(String[] args) {
      System.out.println(longestPalindrome("abccccdd"));
   }

   public static int longestPalindrome(String s) {
      Map<Character, Integer> charMap = new HashMap<>();
      int sum = 0;
      boolean add1 = false;

      for (char val : s.toCharArray()) {
         if (charMap.containsKey(val)) {
            charMap.replace(val, charMap.get(val) + 1);
         } else {
            charMap.put(val, 1);
         }
      }

      for (Integer value : charMap.values()) {
         if (value % 2 == 0) {
            sum += value;
         } else if (value > 2) {
            sum += (value - 1);
            add1 = true;
         } else {
            add1 = true;
         }
      }

      sum = (add1) ? sum + 1 : sum;
      return sum;
   }
}
