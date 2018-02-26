package net.bishnu.leetcode.maximumVacationDays;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 568. Maximum Vacation Days
 * https://leetcode.com/problems/maximum-vacation-days/description/
 */
public class MaximumVacationDaysTest {
    private MaximumVacationDays maximumVacationDays;

    @Before
    public void setUp(){
        maximumVacationDays = new MaximumVacationDays();
    }
    @Test
    public void maxVacationDays1() {
        int[][] flights = new int[][]{{0,1,1},{1,0,1},{1,1,0}};
        int[][] days = new int[][]{{1,3,1},{6,0,3},{3,3,3}};
        int expected = 12;

        int result = maximumVacationDays.maxVacationDays(flights, days);
        assertEquals(expected, result);
    }

    @Test
    public void maxVacationDays2() {
        int[][] flights = new int[][]{{0,0,0},{0,0,0},{0,0,0}};
        int[][] days = new int[][]{{1,1,1},{7,7,7},{7,7,7}};
        int expected = 3;

        int result = maximumVacationDays.maxVacationDays(flights, days);
        assertEquals(expected, result);
    }

    @Test
    public void maxVacationDays3() {
        int[][] flights = new int[][]{{0,1,1},{1,0,1},{1,1,0}};
        int[][] days = new int[][]{{7,0,0},{0,7,0},{0,0,7}};
        int expected = 21;

        int result = maximumVacationDays.maxVacationDays(flights, days);
        assertEquals(expected, result);
    }

    @Test
    public void maxVacationDays4() {
        int[][] flights = new int[][]{{0,0,1},{1,0,0},{0,0,0}};
        int[][] days = new int[][]{{5,2,1},{1,0,4},{2,5,4}};
        int expected = 14;

        int result = maximumVacationDays.maxVacationDays(flights, days);
        assertEquals(expected, result);
    }
}