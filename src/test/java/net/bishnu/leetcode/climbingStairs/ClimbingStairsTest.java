package net.bishnu.leetcode.climbingStairs;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClimbingStairsTest {
    @Test
    public void climbStairs() throws Exception {
        int[] expected = new int[]{1, 1, 2, 3, 5};

        for(int i=0; i<expected.length; i++){
            assertEquals(expected[i], ClimbingStairs.climbStairs(i));
        }
    }

}