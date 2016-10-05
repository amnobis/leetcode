/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem121 {
   public static void main(String[] args) {
      System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
   }

   public static int maxProfit(int[] prices) {
      return profit(prices[0], prices);
   }

   public static int profit(int min, int[] prices) {
      int val = 0;

      for (int i = 0; i < prices.length; ++i) {
         int val1 = prices[i] - min;
         int other = prices[i];

         min = (other < min) ? other : min;
         val = (val1 > val) ? val1 : val;
      }

      return val;
   }
}
