/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem342 {
   public static void main(String[] args) {

   }

   public static boolean isPowerOfFour(int num) {
      return (Math.log10(num) / Math.log10(4)) % 1 == 0;
   }
}
