/**
 * @author anobis
 */
public class Problem396 {
    public static void main(String[] args) {
        int[] vals = new int[]{4,3,2,6};
        System.out.println(maxRotateFunction(vals));
    }

    public static int maxRotateFunction(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        int sum = 0;
        int cand = 0;

        for (int i = 0; i < A.length; ++i) {
            sum += A[i];
            cand += A[i] * i;
        }

        int max = cand;
        for (int i = 1; i < A.length; ++i) {
            cand = cand - sum + A[i-1] * A.length;
            max = Math.max(max, cand);
        }
        return max;
    }
}
