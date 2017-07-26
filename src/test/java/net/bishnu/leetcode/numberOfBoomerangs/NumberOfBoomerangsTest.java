package net.bishnu.leetcode.numberOfBoomerangs;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfBoomerangsTest {
    @Test
    public void numberOfBoomerangs() throws Exception {
        int[][] input = new int[][]{{0,0}, {1,0}, {2,0}};
        int expected =2;
        assertEquals(expected, NumberOfBoomerangs.numberOfBoomerangs(input));
    }

}