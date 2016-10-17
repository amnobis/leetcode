/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem66 {
   public static void main(String[] args) {
      int[] vals = new int[5];
      vals[4] = 9;

      plusOne(vals);
   }

   public static int[] plusOne(int[] digits) {
      boolean carry = true;

      for (int i = digits.length - 1; i >= 0 && carry; --i) {
         int val = digits[i];
         val = (carry) ? val + 1 : val;

         if (val == 10) {
            val = 0;
            carry = true;
         } else {
            carry = false;
         }
         digits[i] = val;
      }

      if (carry) {
         int[] out = new int[digits.length+1];

         for (int i = 0; i < digits.length-1; ++i) {
            out[i+1] = digits[i];
         }
         out[0] = 1;
         return out;
      }
      return digits;
   }
}
