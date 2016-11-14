import java.util.HashMap;
import java.util.Map;

/**
 * @author anobis
 */
public class Problem290 {
    public static void main(String[] args) {
        System.out.println(wordPattern("abcdefghijklmnnmlkjihgfedcba", "aa bb cc dd ee ff gg hh ii jj kk ll mm nn nn mm ll kk jj ii hh gg ff ee dd cc bb aa"));
    }

    public static boolean wordPattern(String pattern, String str) {
        Map<String, Integer> mapB = new HashMap<>();
        String[] out = str.split(" ");
        int[] mapA = new int[26];
        int[] patt = new int[pattern.length()];
        int countA = 0;
        int countB = 0;
        int i = 0;

        if (out.length != pattern.length()) {
            return false;
        }

        for (String val : out) {
            int calc = pattern.charAt(i) - 'a';

            if (!mapB.containsKey(val)) {
                countA++;
                mapB.put(val , countA);
            }

            if (mapA[calc] == 0) {
                countB++;
                mapA[calc] = countB;
            }

            if (countA != countB) {
                return false;
            }
            ++i;
        }
        return true;
    }
}
