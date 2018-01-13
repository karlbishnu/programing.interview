package net.bishnu.leetcode.nextClosestTime;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 681. Next Closest Time
 * https://leetcode.com/problems/next-closest-time/description/
 */
public class NextClosestTimeTest {
    NextClosestTime nextClosestTime = new NextClosestTime();

    @Test
    public void nextClosestTime1() {
        String time = "19:34";
        String expected = "19:39";
        assertEquals(expected, nextClosestTime.nextClosestTime(time));
    }

    @Test
    public void nextClosestTime2() {
        String time = "23:59";
        String expected = "22:22";
        assertEquals(expected, nextClosestTime.nextClosestTime(time));
    }

    @Test
    public void nextClosestTime3() {
        String time = "01:34";
        String expected = "01:40";
        assertEquals(expected, nextClosestTime.nextClosestTime(time));
    }
}