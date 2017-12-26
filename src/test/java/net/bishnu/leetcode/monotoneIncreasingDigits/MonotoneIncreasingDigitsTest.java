package net.bishnu.leetcode.monotoneIncreasingDigits;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 738. Monotone Increasing Digits
 * https://leetcode.com/problems/monotone-increasing-digits/hints/
 */
public class MonotoneIncreasingDigitsTest {
    private MonotoneIncreasingDigits monotoneIncreasingDigits = new MonotoneIncreasingDigits();

    @Test
    public void monotoneIncreasingDigits1() {
        int input = 8;
        int expected = 8;
        assertEquals(expected, monotoneIncreasingDigits.monotoneIncreasingDigits(input));
    }

    @Test
    public void monotoneIncreasingDigits2() {
        int input = 0;
        int expected = 0;
        assertEquals(expected, monotoneIncreasingDigits.monotoneIncreasingDigits(input));
    }

    @Test
    public void monotoneIncreasingDigits3() {
        int input = 330;
        int expected = 299;
        assertEquals(expected, monotoneIncreasingDigits.monotoneIncreasingDigits(input));
    }

    @Test
    public void monotoneIncreasingDigits4() {
        int input = 340;
        int expected = 339;
        assertEquals(expected, monotoneIncreasingDigits.monotoneIncreasingDigits(input));
    }

    @Test
    public void monotoneIncreasingDigits5() {
        int input = 325;
        int expected = 299;
        assertEquals(expected, monotoneIncreasingDigits.monotoneIncreasingDigits(input));
    }

    @Test
    public void monotoneIncreasingDigits6() {
        int input = 1325;
        int expected = 1299;
        assertEquals(expected, monotoneIncreasingDigits.monotoneIncreasingDigits(input));
    }

    @Test
    public void monotoneIncreasingDigits7() {
        int input = 100;
        int expected =99;
        assertEquals(expected, monotoneIncreasingDigits.monotoneIncreasingDigits(input));
    }


    @Test
    public void monotoneIncreasingDigits8() {
        int input = 1200;
        int expected = 1199;
        assertEquals(expected, monotoneIncreasingDigits.monotoneIncreasingDigits(input));
    }

    @Test
    public void monotoneIncreasingDigits9() {
        int input = 1333330;
        int expected = 1299999;
        assertEquals(expected, monotoneIncreasingDigits.monotoneIncreasingDigits(input));
    }
}