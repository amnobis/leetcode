/**
 * @author anobis
 */
public class Problem453 {
    public static void main(String[] args) {

    }

    public static int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            min = (num < min) ? num : min;
        }

        int count = 0;

        for (int num : nums) {
            count += (int) Math.abs(min - num);
        }

        return count;
    }
}
