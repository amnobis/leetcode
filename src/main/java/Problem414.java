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
        int[] max = new int[]{-1, -1, -1};
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (num > max[0] && !seen.contains(num)) {
                max[0] = num;
                Arrays.sort(max);
                seen.add(num);
            }
        }
        return max[0];
    }
}
