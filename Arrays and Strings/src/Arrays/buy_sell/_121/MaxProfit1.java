package Arrays.buy_sell._121;

public class MaxProfit1 {
	
	/**
	 * Say you have an array for which the ith element is the price of a given stock on day i.
	 * design an algorithm to find the maximum profit.you cannot sell a stock before you buy one.
	 * Only one transaction
	 * @param prices
	 * @return
	 * O(n^2)
	 */
	public int maxProfit(int prices[]) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];     // sellPrice - buyPrice
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
    }
	
    public int maxProfitBest(int[] prices) {
       int maxProfit = 0;
       int buyPrice = Integer.MAX_VALUE;      // should be the smallest number in the array
       for (int i = 0; i < prices.length; i++) {
    	   buyPrice = Math.min(buyPrice, prices[i]);
    	   maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
       }
       return maxProfit;
    }
}