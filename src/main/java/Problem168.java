/**
 * @author anobis
 */
public class Problem168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(676-1));
    }

    public static String convertToTitle(int n) {
        StringBuilder excel = new StringBuilder();

        while(n != 0) {
            char ch = (char)((n - 1) % 26 + 65);
            n = (n - 1) / 26;
            excel.append(ch);
        }
        return excel.reverse().toString();
    }
}
