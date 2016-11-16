/**
 * @author anobis
 */
public class Problem278 {
    public static void main(String[] args) {
//        System.out.println(firstBadVersion(1));
        System.out.println(firstBadVersion(2126753390));
    }

    public static int firstBadVersion(int n) {
        return (int) findBadVersion(0, n);
    }

    public static long findBadVersion(long start, long end) {
        long guess = (start+end) / 2;

        if (isBadVersion((int)guess) && start == end) {
            return guess;
        } else if (isBadVersion((int)guess)){
            return findBadVersion(start, guess);
        } else {
            return findBadVersion(guess+1, end);
        }
    }

    public static boolean isBadVersion(long n) {
        return n >= 1702766719;
    }
}
