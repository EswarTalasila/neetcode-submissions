class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int maxProfit = 0;

        while(right < prices.length) {
            if(prices[left] < prices[right]) {
                int current_profit = prices[right] - prices[left];
                maxProfit = Math.max(current_profit, maxProfit);
            } else {
                left = right;
            }

            right++;
        }

        return maxProfit;
        
    }
}
