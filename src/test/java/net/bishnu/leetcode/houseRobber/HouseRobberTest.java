package net.bishnu.leetcode.houseRobber;

import org.junit.Test;

import static org.junit.Assert.*;

public class HouseRobberTest {
    @Test
    public void rob1() throws Exception {
        int[] input = new int[0];
        int expected =0;
        assertEquals(expected, HouseRobber.rob(input));
    }

    @Test
    public void rob2() throws Exception {
        int[] input = new int[]{1,0,0,2};
        int expected =3;
        assertEquals(expected, HouseRobber.rob(input));
    }

    @Test
    public void rob3() throws Exception {
        int[] input = new int[]{1, 1, 1, 3, 2};
        int expected =4;
        assertEquals(expected, HouseRobber.rob(input));
    }
}