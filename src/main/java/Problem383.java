/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem383 {
   public static void main(String[] args) {
      canConstruct("aa", "ab");
   }

   public static boolean canConstruct(String ransomNote, String magazine) {
      char[] mag = new char[26];

      char da = 'a';

      System.out.println((int) da);
      magazine.chars().forEach(val -> {
         int index = ((int) val) - 97;
      });

      return true;
   }
}
