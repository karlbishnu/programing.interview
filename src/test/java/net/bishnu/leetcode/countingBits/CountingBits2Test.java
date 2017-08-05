package net.bishnu.leetcode.countingBits;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountingBits2Test {
    @Test
    public void countBit() throws Exception {
        int input= 5;
        int[] expected = new int[]{0,1,1,2,1,2};
        assertArrayEquals(expected, CountingBits2.countBit(input));
    }

}