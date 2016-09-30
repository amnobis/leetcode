/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem13 {
   public static void main(String[] args) {
      // I, V,  X, L,  C,   D,   M
      // 1, 5, 10, 50, 100, 500, 1000
      System.out.println(romanToInt("XCIX"));
      System.out.println(romanToInt("CCXXXIX"));
      System.out.println(romanToInt("MXLIV"));
   }

   public static int romanToInt(String s) {
      int sum = 0;

      for (int i = s.length() - 1; i >= 0; --i) {
         char currChar = s.charAt(i);

         switch(currChar) {
            case 'I':
               sum += (sum >= 5) ? -1 : 1;
               break;
            case 'V':
               sum += 5;
               break;
            case 'X':
               sum += 10 * ((sum >= 50) ? -1 : 1);
               break;
            case 'L':
               sum += 50;
               break;
            case 'C':
               sum += 100 * ((sum >= 500) ? -1 : 1);
               break;
            case 'D':
               sum += 500;
               break;
            case 'M':
               sum += 1000;
               break;
         }
      }
      return sum;
   }
}
