package net.bishnu.leetcode.uniquePaths;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniquePathsTest {
    @Test
    public void uniquePaths1() throws Exception {
        int expected = 1;
        assertEquals(expected, UniquePaths.uniquePaths(1, 100));
    }

    @Test
    public void uniquePaths2() throws Exception {
        int expected = 2;
        assertEquals(expected, UniquePaths.uniquePaths(2, 2));
    }

    @Test
    public void uniquePaths3() throws Exception {
        int expected = 3;
        assertEquals(expected, UniquePaths.uniquePaths(2, 3));
    }

    @Test
    public void uniquePaths4() throws Exception {
        int expected = 20;
        assertEquals(expected, UniquePaths.uniquePaths(4, 4));
    }
}