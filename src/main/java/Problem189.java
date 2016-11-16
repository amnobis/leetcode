/**
 * @author anobis
 */
public class Problem189 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6};
        rotate(nums, 2);

        for (int num : nums) {
            System.out.print(num + ",");
        }
        System.out.println();
    }

    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;

        for (int i = 0; i < len/2; ++i){
            int temp = nums[i];
            nums[i] = nums[len-i-1];
            nums[len-i-1] = temp;
        }

        for (int i = 0;i < k/2; ++i){
            int temp = nums[i];
            nums[i] = nums[k-i-1];
            nums[k-i-1] = temp;
        }

        for (int i = k; i < (k+len)/2; ++i){
            int temp = nums[i];
            nums[i] = nums[len-(i-k)-1];
            nums[len-(i-k)-1] = temp;
        }
    }
}
