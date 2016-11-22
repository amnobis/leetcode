/**
 * @author anobis
 */
public class Problem167 {
    public static void main(String[] args) {
        int[] vals = twoSum(new int[]{0,0,3,4}, 0);

        System.out.println(vals[0]);
        System.out.println(vals[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length == 2) {
            return new int[]{nums[0], nums[1]};
        }
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int val1 = nums[start];
            int val2 = nums[end];

            if (val2 + val1 > target) {
                end = searchForEnd(nums, start, end, target - val1);
            } else if (val2 + val1 < target) {
                start = searchForStart(nums, start, end, target - val2);
            } else {
                return new int[]{start+1, end+1};
            }
        }
        return new int[2];
    }

    public static int searchForEnd(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end-start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }

    public static int searchForStart(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end-start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
