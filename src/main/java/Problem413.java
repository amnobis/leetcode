/**
 * @author anobis
 */
public class Problem413 {
    public static void main(String[] args) {
        int[] test = new int[]{1,2,3,4,5,7};
        System.out.print(numberOfArithmeticSlices(test));
    }

    public static int numberOfArithmeticSlices(int[] A) {
        int[] cache = new int[A.length];
        int sum = 0;

        for (int i = 2; i < A.length; ++i) {
            if (A[i] - A[i-1] == A[i-1] - A[i-2]) {
                cache[i] += cache[i-1] + 1;
                sum += cache[i];
            } else {
                cache[i] = 0;
            }

        }
        return sum;
    }
}
