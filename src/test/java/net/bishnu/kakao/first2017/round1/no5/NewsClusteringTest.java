package net.bishnu.kakao.first2017.round1.no5;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewsClusteringTest {
    @Test
    public void calcJaccard1() throws Exception {
        String str1 = "FRANCE";
        String str2 = "french";
        int expected = 16384;
        assertEquals(expected, NewsClustering.calcJaccard(str1, str2));
    }

    @Test
    public void calcJaccard2() throws Exception {
        assertTrue("ea".matches("[a-z]{2}"));
        String str1 = "handshake";
        String str2 = "shake hands";
        int expected = 65536;
        assertEquals(expected, NewsClustering.calcJaccard(str1, str2));
    }

    @Test
    public void calcJaccard3() throws Exception {
        String str1 = "aa1+aa2";
        String str2 = "AAAA12";
        int expected = 43690;
        assertEquals(expected, NewsClustering.calcJaccard(str1, str2));
    }

    @Test
    public void calcJaccard4() throws Exception {
        String str1 = "E=M*C^2";
        String str2 = "e=m*c^2";
        int expected = 65536;
        assertEquals(expected, NewsClustering.calcJaccard(str1, str2));
    }
}