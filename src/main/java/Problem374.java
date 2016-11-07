/**
 * @author anobis
 */
public class Problem374 {
    private static int val;

    public static void main(String[] args) {
        val = 7;

        guessNumber(10);
    }

    public static int guessNumber(int n) {
        return helper(1,n);
    }

    public static int helper(int start, int end){
        if(start == end) return start;
        int mid = Math.toIntExact(((long)start+(long)end)/2);
        int r = 0;
        if(guess(mid) == 0) r = mid;
        else if(guess(mid) == 1) r = helper(mid+1, end);
        else if(guess(mid) == -1) r = helper(start, mid-1);
        return r;
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
