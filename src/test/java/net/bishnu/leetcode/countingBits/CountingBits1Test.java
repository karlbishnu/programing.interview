package net.bishnu.leetcode.countingBits;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountingBits1Test {
    @Test
    public void countBit() throws Exception {
        int input= 5;
        int[] expected = new int[]{0,1,1,2,1,2};
        assertArrayEquals(expected, CountingBits1.countBit(input));
    }

}