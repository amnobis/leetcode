/**
 * @author anobis
 */
public class Problem14 {
    public static void main(String[] args) {

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        int i = 0;
        StringBuilder prefix = new StringBuilder();

        while (i < strs[0].length()) {
            int poss = strs[0].charAt(i);

            for (String str : strs) {
                if (i > str.length() - 1) {
                    return prefix.toString();
                }

                if (poss != str.charAt(i)) {
                    return prefix.toString();
                }
            }
            prefix.append(strs[0].charAt(i));
            ++i;
        }
        return prefix.toString();
    }
}
