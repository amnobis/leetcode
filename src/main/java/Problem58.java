/**
 * @author anobis
 */
public class Problem58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a bbcb "));
        System.out.println(lengthOfLastWord("abcdefg    "));
        System.out.println(lengthOfLastWord("ad abefg    "));
    }

    public static int lengthOfLastWord(String s) {
        int start = 0;
        boolean trigger = false;

        for (int i = s.length() - 1; i >= 0; --i) {
            if (s.charAt(i) != ' ' && !trigger) {
                start = i;
                trigger = true;
            } else {
                if (trigger && s.charAt(i) == ' ') {
                    return start - i;
                }
            }
        }
        return (trigger) ? start+1 : 0;
    }
}
