/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem258 {
   public static void main(String[] args) {
      System.out.println(addDigits(41));
   }

   public static int addDigits(int num) {
      return 1 + ((num - 1) % 9);
   }
}
