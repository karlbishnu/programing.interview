package net.bishnu.kakao.first2017.round1.no4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShuttleBusTest {
    @Test
    public void getTheLastTime1() throws Exception {
        int n = 1;
        int t = 1;
        int m = 5;
        String[] timetable = new String[]{"08:00", "08:01", "08:02", "08:03"};
        String expected = "09:00";
        assertEquals(expected, ShuttleBus.getTheLastTime(n,t,m,timetable));
    }

    @Test
    public void getTheLastTime2() throws Exception {
        int n = 2;
        int t = 10;
        int m = 2;
        String[] timetable = new String[]{"09:10", "09:09", "08:00"};
        String expected = "09:09";
        assertEquals(expected, ShuttleBus.getTheLastTime(n,t,m,timetable));
    }

    @Test
    public void getTheLastTime3() throws Exception {
        int n = 2;
        int t = 1;
        int m = 2;
        String[] timetable = new String[]{"09:00", "09:00", "09:00", "09:00"};
        String expected = "08:59";
        assertEquals(expected, ShuttleBus.getTheLastTime(n,t,m,timetable));
    }

    @Test
    public void getTheLastTime4() throws Exception {
        int n = 1;
        int t = 1;
        int m = 5;
        String[] timetable = new String[]{"00:01", "00:01", "00:01", "00:01", "00:01"};
        String expected = "00:00";
        assertEquals(expected, ShuttleBus.getTheLastTime(n,t,m,timetable));
    }

    @Test
    public void getTheLastTime5() throws Exception {
        int n = 1;
        int t = 1;
        int m = 1;
        String[] timetable = new String[]{"23:59"};
        String expected = "09:00";
        assertEquals(expected, ShuttleBus.getTheLastTime(n,t,m,timetable));
    }

    @Test
    public void getTheLastTime6() throws Exception {
        int n = 10;
        int t = 60;
        int m = 45;
        String[] timetable = new String[]{"23:59","23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59", "23:59"};
        String expected = "18:00";
        assertEquals(expected, ShuttleBus.getTheLastTime(n,t,m,timetable));
    }
}