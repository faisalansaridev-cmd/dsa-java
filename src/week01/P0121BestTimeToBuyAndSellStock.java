package week01;

// LC 121 Best Time to Buy and Sell Stock
// Pattern: Running minimum
// Time O(n) Space O(1)
// Easy 3 Oct 2026
// Signal: "Track the minimum price seen so far, and constantly check if selling today beats the max profit."
// Solved: with hint

class P0121BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0; // Initialize to 0, not prices[0]!

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            if ((prices[i] - minPrice) > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}