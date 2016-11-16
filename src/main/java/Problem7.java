/**
 * @author anobis
 */
public class Problem7 {
    public static void main(String[] args) {

    }

    public static int reverse(int x) {
        long result = 0;

        while (x != 0)
        {
            long tail = x % 10;
            long newResult = result * 10 + tail;
            if(newResult > Integer.MAX_VALUE || newResult < Integer.MIN_VALUE)
            { return 0; }
            result = newResult;
            x = x / 10;
        }
        return (int)result;
    }
}
