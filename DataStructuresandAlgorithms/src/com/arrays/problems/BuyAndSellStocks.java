package com.arrays.problems;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;  // Handle empty array
        }

        int maxProfit = 0;
        int buyIndex = 0;

        for (int sellIndex = 1; sellIndex < prices.length; sellIndex++) {
            int potentialProfit = prices[sellIndex] - prices[buyIndex];
            if (potentialProfit > 0) {  // Only consider profitable transactions
                maxProfit += potentialProfit;
                buyIndex = sellIndex;  // Reset buyIndex for potential future transactions
            } else if (prices[sellIndex] < prices[buyIndex]) {  // Update buyIndex for potential future profits
                buyIndex = sellIndex;
            }
        }

        return maxProfit;
    }

}
