/**
 * @author anobis
 */
public class Problem374 {
    private static int val;

    public static void main(String[] args) {
        val = 7;


    }

    public static int guessNumber(int n) {
        return 0;
    }

    public static int guess(int n) {
        if (val == n) {
            return 0;
        } else if (n > val) {
            return -1;
        } else {
            return 1;
        }
    }
}
