package net.bishnu.leetcode.floodFill;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 733. Flood Fill
 * https://leetcode.com/problems/flood-fill/description/
 */
public class FloodFillTest {
    FloodFill floodFill = new FloodFill();

    @Test
    public void floodFill() {
        int[][] image = new int[][] {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        int[][] expected = new int[][] {{2,2,2},{2,2,0},{2,0,1}};

        assertArrayEquals(expected, floodFill.floodFill(image, sr, sc, newColor));
    }
}