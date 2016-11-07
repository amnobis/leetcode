/**
 * @author anobis
 */
public class Problem441 {
    public int arrangeCoins(int n) {
        return (int) Math.floor(-0.5 + Math.sqrt(0.25 + 2.0*n));
    }
}
