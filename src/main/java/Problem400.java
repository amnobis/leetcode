/**
 * @author anobis
 */
public class Problem400 {
    public static void main(String[] args) {

    }

    public static int findNthDigit(int n) {
        int k = 1;
        long base = 1;

        // find the corresponding k-digits array
        while(n > base * 9 * k){
            n -= base * 9 * k;
            k++;
            base = base * 10;
        }

        // corresponding integer in the array
        long value = base + (n-1)/k;

        // digit of the integer
        return Long.toString(value).charAt((n-1)%k) - '0';
    }
}
