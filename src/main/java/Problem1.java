import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem1 {
   public static void main(String[] args) {

   }

   public static int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> numMap = new HashMap<>();

      for (int i = 0; i < nums.length; ++i) {
         numMap.put(nums[i], i);
      }

      for (int i = 0; i < nums.length; ++i) {
         int val = target-nums[i];

         if (numMap.containsKey(val)) {
            if (numMap.get(val) != i) {
               return new int[]{i, numMap.get(val)};
            }
         }
      }
      return new int[]{};
   }
}
