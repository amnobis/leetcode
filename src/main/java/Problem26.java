/**
 * @author anobis
 */
public class Problem26 {
    public static void main(String[] args) {

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int length = nums.length;
        int previous = nums[0];
        int index = 1;

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] != previous) {
                nums[index] = nums[i];
                index++;
                previous = nums[i];
            } else {
                length--;
            }
        }
        return length;
    }
}
