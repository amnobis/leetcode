import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem350 {
   public static void main(String[] args) {

   }

   public static int[] intersect(int[] nums1, int[] nums2) {
      Map<Integer, Integer> values = new HashMap<>();
      List<Integer> out = new ArrayList<>();

      for (int i = 0; i < nums1.length; ++i) {
         if (values.containsKey(nums1[i])) {
            values.replace(nums1[i], values.get(nums1[i]) + 1);
         } else {
            values.put(nums1[i], 1);
         }
      }

      for (int i = 0; i < nums2.length; ++i) {
         if (values.containsKey(nums2[i])) {
            if (values.get(nums2[i]) > 0) {
               out.add(nums2[i]);
               values.replace(nums2[i], values.get(nums2[i]) - 1);
            }
         }
      }

      int[] array = new int[out.size()];
      int i = 0;

      for (Integer val : out) {
         array[i] = val;
         ++i;
      }
      return array;
   }
}
