package net.bishnu.leetcode.minimumMovesToEqualArrayElements;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumMovesToEqualArrayElementsTest {
    @Test
    public void minMoves() throws Exception {
        int[] input = new int[]{1,2,3};
        int expected = 3;

        assertEquals(expected, MinimumMovesToEqualArrayElements.minMoves(input));
    }

}