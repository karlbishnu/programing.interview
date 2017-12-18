package net.bishnu.leetcode.numberOfConerRectangles;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 750. Number Of Corner Rectangles
 * https://leetcode.com/problems/number-of-corner-rectangles/description/
 */
public class CornerRectanglesTest {
    CornerRectangles cornerRectangles = new CornerRectangles();

    @Test
    public void countCornerRectangles1() {
        int[][] input = new int[][]{{1, 1, 1, 1}};
        int expected = 0;
        assertEquals(expected, cornerRectangles.countCornerRectangles(input));
    }

    @Test
    public void countCornerRectangles2() {
        int[][] input = new int[][]{{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int expected = 9;
        assertEquals(expected, cornerRectangles.countCornerRectangles(input));
    }

    @Test
    public void countCornerRectangles3() {
        int[][] input = new int[][]{{1, 0, 0, 1, 0}, {0, 0, 1, 0, 1}, {0, 0, 0, 1, 0}, {1, 0, 1, 0, 1}};
        int expected = 1;
        assertEquals(expected, cornerRectangles.countCornerRectangles(input));
    }

    @Test
    public void countCornerRectangles4() {
        int[][] input = new int[][]{{0,0,1,1}, {1,1,1,1}, {0,0,1,0}};
        int expected = 1;
        assertEquals(expected, cornerRectangles.countCornerRectangles(input));
    }
}