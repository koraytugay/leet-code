package biz.tugay.leetcode.array;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuyAndSellStock {

  public int maxProfit(int[] prices) {
    int maxProfit = 0;

    int min = Integer.MAX_VALUE;
    for (int price : prices) {
      if (price < min) {
        min = price;
        continue;
      }
      if (price - min > maxProfit) {
        maxProfit = price - min;
      }
    }

    return maxProfit;
  }
}
