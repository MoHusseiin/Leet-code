package Arrays.buy_sell._123;

// Very Hard
public class MaxProfit3 {
	
	/**
	 * Say you have an array for which the ith element is the price of a given stock on day i.
	 * design an algorithm to find the maximum profit.you cannot sell a stock before you buy one.
	 * You may complete at most two transactions.
	 * Not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).
	 * @param prices
	 * @return
	 * O(n)
	 */
	public int maxProfit(int[] prices) {
	   int maxProfit = 0;
       int buyPrice = Integer.MAX_VALUE;      // should be the smallest number in the array
       int[] profitOfMinPrice = new int[prices.length];
       for (int i = 0; i < prices.length; i++) {
    	   if(buyPrice > prices[i])
    		   buyPrice = prices[i];
    	   else
    		   maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
    	   profitOfMinPrice[i] = maxProfit;
       }
       maxProfit = 0;
       int sellPrice = Integer.MIN_VALUE;   // should be the largest number in the array
       int[] profitOfMaxPrice = new int[prices.length];
       for (int i = prices.length - 1; i >= 0; i--) {
    	   if(sellPrice < prices[i])
    		   sellPrice = prices[i];
    	  else
    		  maxProfit = Math.max(maxProfit, sellPrice - prices[i]);
    	   profitOfMaxPrice[i] = maxProfit;
       }
       maxProfit = 0;
       for (int i = 0; i < prices.length; i++) {
    	   maxProfit = Math.max(maxProfit, profitOfMaxPrice[i] + profitOfMinPrice[i]);
       }
       return maxProfit;
    }
	
	class Interval { 
	    int buy, sell, profit;

		@Override
		public String toString() {
			return "Interval [buy=" + buy + ", sell=" + sell + ", profit=" + profit + "]";
		}
	} 
}
