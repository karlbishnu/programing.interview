package net.bishnu.leetcode.maximumSubarray;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubArrayTest {
    @Test
    public void maxSubArray() throws Exception {
        int[] input = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int expected =6;
        assertEquals(expected, MaximumSubArray.maxSubArray(input));
    }

    @Test
    public void maxSubArray2() throws Exception {
        int[] input = new int[]{-2};
        int expected =-2;
        assertEquals(expected, MaximumSubArray.maxSubArray(input));
    }

    @Test
    public void maxSubArray3() throws Exception {
        int[] input = new int[]{1, 2};
        int expected =3;
        assertEquals(expected, MaximumSubArray.maxSubArray(input));
    }

}