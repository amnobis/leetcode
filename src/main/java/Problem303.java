/**
 * @author anobis
 */
public class Problem303 {
    public static void main(String[] args) {
        int[] vals = new int[]{-2, 0, 3, -5, 2, -1};
        int[] cache = new int[vals.length];
        // -2 -2 1 -4 -2  -3

        int i = 0;
        int sum = 0;
        for (int num : vals) {
            sum += num;
            cache[i++] = sum;
        }
        System.out.println(sumRange(0, 2, cache));
        System.out.println(sumRange(2, 5, cache));
        System.out.println(sumRange(0, 5, cache));
    }

    public static int sumRange(int i, int j, int[] cache) {
        return cache[j] - ((i == 0) ? 0 : cache[i-1]);
    }
}
