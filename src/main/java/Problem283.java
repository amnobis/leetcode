/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem283 {
   public static void main(String[] args) {
      int[] vals = new int[] {0,0,1};

      moveZeroes(vals);
   }

   public static void moveZeroes(int[] nums) {
      int lastNonZero = 0;

      for (int i = 0; i < nums.length; ++i) {
         if (nums[i] != 0) {
            int tmp = nums[i];
            nums[i] = nums[lastNonZero];
            nums[lastNonZero] = nums[i];
            lastNonZero++;
         }
      }
   }
}
