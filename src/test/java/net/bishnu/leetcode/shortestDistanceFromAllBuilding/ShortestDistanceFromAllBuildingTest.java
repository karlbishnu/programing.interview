package net.bishnu.leetcode.shortestDistanceFromAllBuilding;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-04-23.
 */
public class ShortestDistanceFromAllBuildingTest {
    @Test
    public void shortestDistance() throws Exception {
        ShortestDistanceFromAllBuilding solution = new ShortestDistanceFromAllBuilding();
        int[][] grid = {{1,0,2,0,1},{0,0,0,0,0}, {0,0,1,0,0}};
        int expected = 7;
        assertEquals(expected, solution.shortestDistance(grid));
    }

    @Test
    public void shortestDistance1() throws Exception {
        ShortestDistanceFromAllBuilding solution = new ShortestDistanceFromAllBuilding();
        int[][] grid = {{1,0,1,0,1}};
        int expected = -1;
        assertEquals(expected, solution.shortestDistance(grid));
    }
}