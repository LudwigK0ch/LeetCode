/**
* Problem: 121. Best Time to Buy and Sell Stock
* Difficulty: Easy
* Categories: Array, Dynamic Programming
* Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock
*/

class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) return 0;
        
        int max = 0;
        int buy = 0;
        int sell = buy + 1;
        
        while(sell < prices.length){
            max = Math.max(max, prices[sell] - prices[buy]);
            if(prices[buy] > prices[sell]){
                buy = sell;
            }
            sell++;
        }
        
        return max;
    }
}