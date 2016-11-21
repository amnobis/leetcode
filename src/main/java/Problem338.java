/**
 * @author anobis
 */
public class Problem338 {
    public static void main(String[] args) {
        countBits(12);


    }

    public static int[] countBits(int num) {
        int[] bits = new int[num + 1];

        for (int i = 1; i <= num; ++i) {
            bits[i] = bits[i >> 1] + (i & 1);
        }

        return bits;
    }
}
