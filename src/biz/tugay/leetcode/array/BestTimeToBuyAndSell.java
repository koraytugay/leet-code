package biz.tugay.leetcode.array;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii
public class BestTimeToBuyAndSell {

  public int maxProfit(int[] prices) {
    int profit = 0;

    for (int i = 0; i < prices.length - 1; i++) {
      if (prices[i + 1] < prices[i]) {
        continue;
      }

      for (int j = i + 1; j < prices.length; j++) {
        // sell if it is last opportunity or if it is going lower tomorrow
        // remember at this point we are higher to the day we bought
        if (j == prices.length - 1 || prices[j + 1] < prices[j]) {
          profit = profit + prices[j] - prices[i];
          i = j;  // fast forward i
          break;  // break inner loop
        }
      }
    }

    return profit;
  }
}
