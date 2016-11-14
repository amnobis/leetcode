/**
 * @author anobis
 */
public class Problem88 {
    public static void main(String[] args) {

    }

    public static void merge(int[] nums1, int n, int[] nums2, int m) {
        for (int i = m + n - 1; i >= 0; --i) {
            if (m == 0) {
                nums1[i] = nums1[n-1];
                n--;
            } else if (n == 0) {
                nums1[i] = nums2[m-1];
                m--;
            } else if (nums1[n-1] > nums2[m-1]) {
                nums1[i] = nums1[n-1];
                n--;
            } else {
                nums1[i] = nums2[m-1];
                m--;
            }
        }
    }
}
