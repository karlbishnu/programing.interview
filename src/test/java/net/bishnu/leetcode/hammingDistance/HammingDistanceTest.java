package net.bishnu.leetcode.hammingDistance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 461. Hamming Distance
 * https://leetcode.com/problems/hamming-distance/description/
 */
public class HammingDistanceTest {
    private HammingDistance hammingDistance;

    @Before
    public void setUp(){
        hammingDistance = new HammingDistance();
    }

    @Test
    public void hammingDistance1() throws Exception {
        int x = 0;
        int y = 0;
        int expected = 0;
        assertEquals(expected, hammingDistance.hammingDistance(x, y));
    }

    @Test
    public void hammingDistance2() throws Exception {
        int x = 0;
        int y = 1;
        int expected = 1;
        assertEquals(expected, hammingDistance.hammingDistance(x, y));
    }

    @Test
    public void hammingDistance4() throws Exception {
        int x = 1;
        int y = 4;
        int expected = 2;
        assertEquals(expected, hammingDistance.hammingDistance(x, y));
    }

    @Test
    public void hammingDistance5() throws Exception {
        int x = 1;
        int y = Integer.MAX_VALUE;
        int expected = 30;
        assertEquals(expected, hammingDistance.hammingDistance(x, y));
    }

}