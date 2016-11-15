/**
 * @author anobis
 */
public class Problem125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("abcba"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome(".,"));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }

        for (int i = 0, j = s.length() - 1; i < j; ++i, --j) {
            Character a = s.charAt(i);
            Character b = s.charAt(j);


            while (!Character.isLetter(a) && !Character.isDigit(a) && i < s.length()-1) {
                ++i;
                a = s.charAt(i);
            }

            while (!Character.isLetter(b) && !Character.isDigit(b) && j > 0) {
                --j;
                b = s.charAt(j);
            }

            if (i > j) {
                return true;
            }

            if (Character.toLowerCase(a) != Character.toLowerCase(b)) {
                return false;
            }
        }
        return true;
    }
}
