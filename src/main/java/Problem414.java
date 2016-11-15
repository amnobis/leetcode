import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author anobis
 */
public class Problem414 {
    public static void main(String[] args) {

    }

    public static int thirdMax(int[] nums) {
        int[] max = new int[3];
        Set<Integer> seen = new HashSet<>();
        Arrays.fill(max, Integer.MIN_VALUE);

        for (int num : nums) {
            if (num > max[0] && !seen.contains(num)) {
                max[0] = num;
                Arrays.sort(max);
            }
            seen.add(num);
        }
        return (seen.size() < 3) ? max[2] : max[0];
    }
}
