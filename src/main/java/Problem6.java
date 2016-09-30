import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.StrictMath.abs;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem6 {
   public static void main(String[] args) {
      System.out.println(convert("A", 1));
      System.out.println(convert("AB", 1));
      System.out.println(convert("BA", 2));
      System.out.println(convert("ABC", 2));
      System.out.println(convert("ABCD", 2));
      System.out.println(convert("PAYPALISHIRING", 3));
   }

   public static String convert(String s, int numRows) {
      int val = numRows * 2 - 2;
      String out = "";
      String[] rows = new String[numRows];
      Arrays.fill(rows, "");

      if (val == 0 || s.length() == 1) {
         return s;
      }

      int num = 0;
      boolean rev = true;
      int border = numRows-1;

      for (int i = 0; i <= s.length()-1; i += val) {
         for (int j = i; j < i+val && j < s.length(); ++j) {
            rows[num] += s.charAt(j);

            if (num < border && rev) {
               num++;
            } else if (num == border) {
               num--;
               rev = false;
            } else if (num > 0 && !rev) {
               num--;
            } else {
               num++;
               rev = true;
            }
         }
      }

      for (int i = 0; i < rows.length; ++i) {
         out += rows[i];
      }

      return out;
   }
}
