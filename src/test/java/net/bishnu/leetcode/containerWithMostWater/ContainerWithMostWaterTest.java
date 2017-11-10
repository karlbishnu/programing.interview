package net.bishnu.leetcode.containerWithMostWater;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * 11. Container With Most Water
 * https://leetcode.com/problems/container-with-most-water/description/
 */
public class ContainerWithMostWaterTest {
    ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @Test
    public void maxArea1() throws Exception {
        int[] heights = new int[]{2,3,4,5,6};
        int expected=9;

        assertEquals(expected, containerWithMostWater.maxArea(heights));
    }

    @Test
    public void maxArea2() throws Exception {
        int[] heights = new int[]{4,2,6};
        int expected=8;

        assertEquals(expected, containerWithMostWater.maxArea(heights));
    }

    @Test(timeout = 100l)
    public void maxArea3(){
        int[] heights = new int[15000];
        Arrays.setAll(heights, i->i+1);
        int expected=56250000;

        assertEquals(expected, containerWithMostWater.maxArea(heights));
    }

}