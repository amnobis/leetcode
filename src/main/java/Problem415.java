/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem415 {
   public static void main(String[] args) {
      System.out.println(addStrings("9", "99"));
   }

   public static String addStrings(String num1, String num2) {
      int length1 = (num1.length() > num2.length()) ? num2.length() : num1.length();
      int length2 = (num1.length() > num2.length()) ? num1.length() : num2.length();
      boolean carry = false;
      String result = "";

      for (int i = 0; i < length1; ++i) {
         int val1 = Integer.valueOf(num1.substring(num1.length() - 1 - i, num1.length() - i));
         int val2 = Integer.valueOf(num2.substring(num2.length() - 1 - i, num2.length() - i));
         int delta = (carry) ? 1 : 0;

         int digit = val1 + val2 + delta;

         if (digit > 9) {
            carry = true;
            digit -= 10;
         } else {
            carry = false;
         }

         result = String.valueOf(digit) + result;
      }
      String end;

      if (num1.length() == num2.length()) {
         if (carry) {
            result = "1" + result;
         }
         return result;
      } else if (num1.length() > num2.length()) {
         end = num1;
      } else {
         end = num2;
      }

      for (int i = length1; i < length2; ++i) {
         int val1 = Integer.valueOf(end.substring(end.length() - 1 - i, end.length() - i));
         int delta = (carry) ? 1 : 0;

         int digit = val1 + delta;

         if (digit > 9) {
            carry = true;
            digit -= 10;
         } else {
            carry = false;
         }

         result = String.valueOf(digit) + result;
      }

      if (carry) {
         result = "1" + result;
      }

      return result;
   }
}
