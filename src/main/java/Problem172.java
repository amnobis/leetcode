/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem172 {
   public int trailingZeroes(int n) {
      return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
   }
}
