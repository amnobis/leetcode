/**
 * @author anobis
 */
public class Problem67 {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("111", "1"));
    }

    public static String addBinary(String a, String b) {
        // 1011010011
        // 111
        String s = (a.length() > b.length()) ? a : b;
        String t = (a.length() > b.length()) ? b : a;
        StringBuilder out = new StringBuilder();
        int carry = 0;
        int j = s.length() - 1;

        for (int i = t.length() - 1; i >= 0; --i, --j) {
            int bin1 = t.charAt(i) - 48;
            int bin2 = s.charAt(j) - 48;
            int res = bin1 + bin2 + carry;

            switch (res) {
                case 3:
                    out.append("1");
                    carry = 1;
                    break;
                case 2:
                    out.append("0");
                    carry = 1;
                    break;
                case 1:
                    out.append("1");
                    carry = 0;
                    break;
                case 0:
                    out.append("0");
                    carry = 0;
                    break;
            }
        }

        while (j >= 0) {
            int bin = s.charAt(j) - 48;
            int res = bin + carry;

            switch (res) {
                case 2:
                    out.append("0");
                    carry = 1;
                    break;
                case 1:
                    out.append("1");
                    carry = 0;
                    break;
                case 0:
                    out.append("0");
                    carry = 0;
                    break;
            }
            --j;
        }

        if (carry == 1) {
            out.append("1");
        }

        return out.reverse().toString();
    }
}
