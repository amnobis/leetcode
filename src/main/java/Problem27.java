/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem27 {
   public int removeElement(int[] nums, int val) {
      int length = nums.length;

      if (length == 0) {
         return 0;
      }
      for (int i = 0; i < length; ++i) {
         if (nums[i] == val) {
            int tmp = nums[length-1];
            while (tmp == val && length-1 > i) {
               length--;
               tmp = nums[length-1];
            }

            nums[i] = nums[length-1];
            nums[length-1] = nums[i];
            length--;
         }
      }
      return length;
   }
}
