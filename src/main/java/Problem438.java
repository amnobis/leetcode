import java.util.*;

/**
 * @author anobis
 */
public class Problem438 {
    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));
        System.out.println(findAnagrams("abab", "ab"));
        System.out.println(findAnagrams("abacbabc", "abc"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) {
            return list;
        }
        int[] hash = new int[256];

        p.chars().forEach(val -> hash[val]++);

        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (hash[s.charAt(right++)]-- >= 1) {
                count--;
            }

            if (count == 0) {
                list.add(left);
            }

            if (right-left == p.length() && hash[s.charAt(left++)]++ >= 0) {
                count++;
            }
        }
        return list;
    }
}
