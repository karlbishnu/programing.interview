package net.bishnu.leetcode.singleNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 136. Single Number
 * https://leetcode.com/problems/single-number/description/
 */
public class SingleNumberTest {
    SingleNumber singleNumber = new SingleNumber();
    @Test
    public void singleNumber1() throws Exception {
        int[] nums = new int[]{1};
        int expected = 1;

        assertEquals(expected, singleNumber.singleNumber(nums));
    }

    @Test
    public void singleNumber2() throws Exception {
        int[] nums = new int[]{1,1,2,4,4};
        int expected = 2;

        assertEquals(expected, singleNumber.singleNumber(nums));
    }

}