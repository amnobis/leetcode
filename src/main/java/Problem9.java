/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem9 {
   public static void main(String[] args) {
      System.out.println(isPalindrome(999));
      System.out.println(isPalindrome(121));
      System.out.println(isPalindrome(15451));
      System.out.println(isPalindrome(10));
   }

   public static boolean isPalindrome(int x) {
      if (x < 0) return false;

      int p = x;
      int q = 0;

      while (p >= 10){
         q = q*10 + p%10;
         p /=10;
      }

      return q == x / 10 && p == x % 10;
   }
}
