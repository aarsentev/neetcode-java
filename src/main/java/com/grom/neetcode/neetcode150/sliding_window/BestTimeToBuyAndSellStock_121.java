package com.grom.neetcode.neetcode150.sliding_window;

/**
 * NeetCode 150 - Sliding Window - Best Time to Buy and Sell Stock (LeetCode #121).
 */
public class BestTimeToBuyAndSellStock_121 {

    public int maxProfit(int[] prices) {
        int[] max_diff = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            max_diff[i] = 0;
            for (int j = (i + 1); j < prices.length; j++) {
                int price_diff = prices[j] - prices[i];
                if (price_diff > max_diff[i]) {
                    max_diff[i] = price_diff;
                }
            }
        }
        int top_diff = 0;
        for (int k = 0; k < max_diff.length; k++) {
            if (max_diff[k] > top_diff) {
                top_diff = max_diff[k];
            }
        }
        return top_diff;
    }
}
