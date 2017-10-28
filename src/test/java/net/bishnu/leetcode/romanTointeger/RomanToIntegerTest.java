package net.bishnu.leetcode.romanTointeger;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 13.Roman To Integer
 * https://leetcode.com/problems/roman-to-integer/description/
 */
public class RomanToIntegerTest {
    @Test
    public void romanToInt1() throws Exception {
        String input = "DCXXI";
        int expected = 621;
        assertEquals(expected, RomanToInteger.romanToInt(input));
    }

    @Test
    public void romanToInt2() throws Exception {
        String input = "DCX XI";
        int expected = 621;
        assertEquals(expected, RomanToInteger.romanToInt(input));
    }

    @Test
    public void romanToInt3() throws Exception {
        String input = "DCI XX";
        int expected = 621;
        assertEquals(expected, RomanToInteger.romanToInt(input));
    }

    @Test
    public void romanToInt4() throws Exception {
        String input = "DCIXX";
        int expected = 619;
        assertEquals(expected, RomanToInteger.romanToInt(input));
    }
}