package net.bishnu.leetcode.bestTimeToBuyAndSellStock;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 121. Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/#/description
 */
public class BestTimeToBuyAndSellStockTest {
    @Test
    public void maxProfit() throws Exception {
        int[] input = new int[]{7,1,5,3,6,4};
        int expected = 5;
        assertEquals(expected, BestTimeToBuyAndSellStock.maxProfit(input));
    }

    @Test
    public void maxProfit1() throws Exception {
        int[] input = new int[]{7,6,4,3,1};
        int expected = 0;
        assertEquals(expected, BestTimeToBuyAndSellStock.maxProfit(input));
    }

}