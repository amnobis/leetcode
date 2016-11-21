/**
 * @author anobis
 */
public class Problem338 {
    public static void main(String[] args) {
        countBits(12);


    }

    public static int[] countBits(int num) {
        int[] bits = new int[num + 1];

        if (num == 0) {
            return new int[]{0};
        } else if (num == 1) {
            return new int[]{0, 1};
        } else if (num == 2) {
            return new int[]{0, 1, 1};
        }

        bits[0] = 0;
        bits[1] = 1;
        bits[2] = 1;

        for (int i = 3; i <= num; ++i) {
            if ((i & (i - 1)) == 0) {
                bits[i] = 1;
            } else {
                int val = (int) (Math.log(i) / Math.log(2));
                int val2 = i - (int) Math.pow(2, val);

                bits[i] = 1 + bits[val2];
            }
        }

        return bits;
    }
}
