package net.bishnu.leetcode.maximumProductSubarray;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.junit.Assert.*;


/**
 * 152. Maximum Product Subarray
 * https://leetcode.com/problems/maximum-product-subarray/description/
 */
public class MaximumProductSubarrayTest {
    private MaximumProductSubarray maximumProductSubarray;

    @Before
    public void setUp(){
        maximumProductSubarray = new MaximumProductSubarray();
    }

    @Test
    public void maxProduct1() throws Exception {
        int[] nums = new int[]{2,3,-2,4};
        int expected = 6;

        assertEquals(expected, maximumProductSubarray.maxProduct(nums));
    }


    @Test
    public void maxProduct2() throws Exception {
        int[] nums = new int[]{-5,-1,-2,4};
        int expected = 8;

        assertEquals(expected, maximumProductSubarray.maxProduct(nums));
    }
}