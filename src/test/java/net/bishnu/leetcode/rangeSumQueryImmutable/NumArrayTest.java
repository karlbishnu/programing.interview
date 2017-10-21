package net.bishnu.leetcode.rangeSumQueryImmutable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 303. Range Sum Query - Immutable
 * https://leetcode.com/problems/range-sum-query-immutable/description/
 */
public class NumArrayTest {
    private int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
    private NumArray numArray;

    @Before
    public void setUp(){
        numArray = new NumArray(nums);
    }

    @Test
    public void sumRange1() throws Exception {
        int expected = 1;
        int result = numArray.sumRange(0, 2);
        assertEquals(expected, result);
    }

    @Test
    public void sumRange2() throws Exception {
        int expected = -1;
        int result = numArray.sumRange(2, 5);
        assertEquals(expected, result);
    }

    @Test
    public void sumRange3() throws Exception {
        int expected = -3;
        int result = numArray.sumRange(0, 5);
        assertEquals(expected, result);
    }

}