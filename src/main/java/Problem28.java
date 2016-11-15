/**
 * @author anobis
 */
public class Problem28 {
    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "issip"));
    }

    public static int strStr(String haystack, String needle) {
        int start = 0;
        int curr = 0;
        int end = haystack.length();

        while (curr < end) {
            if ((curr-start) == needle.length()) {
                return start;
            }

            if (haystack.charAt(curr) != needle.charAt(curr++-start)) {
                start++;
                curr = start;
            }
        }
        return (curr-start) == needle.length() ? start : -1;
    }
}
