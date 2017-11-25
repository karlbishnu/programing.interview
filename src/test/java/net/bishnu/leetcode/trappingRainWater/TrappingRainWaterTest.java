package net.bishnu.leetcode.trappingRainWater;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 42. Trapping Rain Water
 * https://leetcode.com/problems/trapping-rain-water/description/
 */
public class TrappingRainWaterTest {
    TrappingRainWater trappingRainWater = new TrappingRainWater();
    @Test
    public void trap1() throws Exception {
        int[] input = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int expected = 6;
        assertEquals(expected, trappingRainWater.trap(input));
    }

    @Test
    public void trap2() throws Exception {
        int[] input = new int[]{2,1,0,2};
        int expected = 3;
        assertEquals(expected, trappingRainWater.trap(input));
    }

    @Test
    public void trap3() throws Exception {
        int[] input = new int[]{6,4,2,0,3,2,0,3,1,4,5,3,2,7,5,3,0,1,2,1,3,4,6,8,1,3};
        int expected = 83;
        assertEquals(expected, trappingRainWater.trap(input));
    }
}