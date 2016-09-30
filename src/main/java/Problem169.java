import java.util.Arrays;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem169 {
   public static void main(String[] args) {

   }

   public static int majorityElement(int[] nums) {
      Arrays.sort(nums);
      return nums[nums.length/2];
   }
}
