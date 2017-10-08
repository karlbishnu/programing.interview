package net.bishnu.kakao.first2017.round1.no2;

import org.junit.Test;

import static org.junit.Assert.*;

public class DartTest {
    @Test
    public void sum() throws Exception {
        String input = "1S2D*3T";
        int expected = 37;

        assertEquals(expected, Dart.sum(input));
    }

    @Test
    public void sum2() throws Exception {
        String input = "1D2S#10S";
        int expected = 9;

        assertEquals(expected, Dart.sum(input));
    }

    @Test
    public void sum3() throws Exception {
        String input = "1D2S0T";
        int expected = 3;

        assertEquals(expected, Dart.sum(input));
    }

    @Test
    public void sum4() throws Exception {
        String input = "1S*2T*3S";
        int expected = 23;

        assertEquals(expected, Dart.sum(input));
    }

    @Test
    public void sum5() throws Exception {
        String input = "1D#2S*3S";
        int expected = 5;

        assertEquals(expected, Dart.sum(input));
    }

    @Test
    public void sum6() throws Exception {
        String input = "1T2D3D#";
        int expected = -4;

        assertEquals(expected, Dart.sum(input));
    }

    @Test
    public void sum7() throws Exception {
        String input = "1D2S3T*";
        int expected = 59;

        assertEquals(expected, Dart.sum(input));
    }
}