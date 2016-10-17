import java.util.Arrays;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem198 {
   public int rob(int[] nums) {
      int[] cache = new int[nums.length+1];
      Arrays.fill(cache, -1);

      return sell(0, nums, cache);
   }

   public int sell(int i, int[] nums, int[] cache) {
      if (i >= nums.length) {
         return 0;
      }

      if (cache[i] != -1) {
         return cache[i];
      }

      cache[i] = Math.max(
         sell(i+2,nums,cache) + nums[i],
         sell(i+1,nums,cache));

      return cache[i];
   }
}
