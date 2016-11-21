/**
 * @author anobis
 */
public class Problem260 {
    public static void main(String[] args) {

    }

    public static int[] singleNumber(int[] nums) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        int comp = xor & ~(xor-1);
        int val1 = 0;
        int val2 = 0;

        for (int num : nums) {
            if ((num & comp) > 0) {
                val1 ^= num;
            } else {
                val2 ^= num;
            }
        }

        return new int[]{val1, val2};
    }
}
