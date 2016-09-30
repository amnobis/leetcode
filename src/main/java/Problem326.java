/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem326 {
   public static void main(String[] args) {
      System.out.println(isPowerOfThree(3));
      System.out.println(isPowerOfThree(9));
      System.out.println(isPowerOfThree(0));
      System.out.println(isPowerOfThree(45));
      System.out.println(isPowerOfThree(90));
   }

   public static boolean isPowerOfThree(int n) {
      return (Math.log10(n) / Math.log10(3)) % 1 == 0;
   }
}
