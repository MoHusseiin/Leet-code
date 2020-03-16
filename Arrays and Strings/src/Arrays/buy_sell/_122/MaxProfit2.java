package Arrays.buy_sell._122;

public class MaxProfit2 {
	
	/**
	 * Say you have an array for which the ith element is the price of a given stock on day i.
	 * design an algorithm to find the maximum profit.you cannot sell a stock before you buy one.
	 * You may complete as many transactions as you like
	 * @param prices
	 * @return
	 * O(n)
	 */
	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		if(prices.length < 2)
			return maxProfit;
		for (int i = 1; i < prices.length; i++) {
			if(prices[i] > prices[i - 1]) {
				maxProfit += prices[i] - prices[i - 1];
			}
		}
		return maxProfit;
	}
}
