package net.bishnu.leetcode.threeSumSmaller;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-04-19.
 */
public class ThreeSumSmallerTest {
    @Test
    public void threeSumSmaller() throws Exception {
        int[] array = new int[]{-2, 1, 0, 3};
        int expected = 2;
        int result = ThreeSumSmaller.threeSumSmaller(array, 2);
        assertEquals(expected, result);
    }

    @Test
    public void threeSumSmaller1() throws Exception {
        int[] array = new int[]{0, 0, 0};
        int expected = 0;
        int result = ThreeSumSmaller.threeSumSmaller(array, 0);
        assertEquals(expected, result);
    }

    @Test
    public void threeSumSmaller2() throws Exception {
        int[] array = new int[]{-1, 1, -1, -1};
        int expected = 1;
        int result = ThreeSumSmaller.threeSumSmaller(array, -1);
        assertEquals(expected, result);
    }

    @Test
    public void threeSumSmaller3() throws Exception {
        int[] array = new int[]{0,-4,-1,1,-1,2};
        int expected = 1;
        int result = ThreeSumSmaller.threeSumSmaller(array, -5);
        assertEquals(expected, result);
    }

}