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
        Set<Character> pSet = new HashSet<>();

        for (char val : p.toCharArray()) {
            pSet.add(val);
        }

        List<Integer> out = new ArrayList<>();
        Set<Character> tmp = new HashSet<>(pSet);
        int star = 0;
        int curr = 0;
        int end = p.length() - 1;

        while (end < s.length()) {
            char valC = s.charAt(curr);
            char valS = s.charAt(star);

            if (!tmp.contains(valC)) {
                tmp = new HashSet<>(pSet);
                star++;
                end++;
                curr = star;
            } else {
                tmp.remove(valC);
                curr++;
                if (tmp.size() == 0) {
                    out.add(star);
                    star++;
                    end++;
                    curr = end;
                    tmp = new HashSet<>(pSet);
                }
            }
        }
        return out;
    }
}
