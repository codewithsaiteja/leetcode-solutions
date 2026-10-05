// 2 ms | 94.3 MB
class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int max_profit = 0;

        for(int j = 1; j < prices.length; j++) {

            if(prices[j] < prices[i]) {
                i = j;
            } else {
                int profit = prices[j] - prices[i];

                if(profit > max_profit) {
                    max_profit = profit;
                }
            }
        }

        return max_profit;
    }
}