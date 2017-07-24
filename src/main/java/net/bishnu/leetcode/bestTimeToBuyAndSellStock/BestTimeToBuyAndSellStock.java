package net.bishnu.leetcode.bestTimeToBuyAndSellStock;

/**
 * 121. Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/#/description
 */
public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices){
        int prev = Integer.MAX_VALUE;
        int currMax = 0;
        for(int price: prices){
            int profit = prev>price ? 0 : price-prev;
            currMax = Math.max(profit, currMax);
            prev = Math.min(prev, price);
        }
        return currMax;
    }
}
