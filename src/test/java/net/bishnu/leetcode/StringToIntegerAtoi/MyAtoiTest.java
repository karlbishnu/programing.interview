package net.bishnu.leetcode.StringToIntegerAtoi;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 8. String to Integer (atoi)
 * https://leetcode.com/problems/string-to-integer-atoi/description/
 */
public class MyAtoiTest {
    @Test
    public void myAtoi1() throws Exception {
        String input = "-214748364832543";
        int expected = Integer.MIN_VALUE;
        assertEquals(expected, MyAtoi.myAtoi(input));
    }

    @Test
    public void myAtoi2() throws Exception {
        String input = "";
        int expected = 0;
        assertEquals(expected, MyAtoi.myAtoi(input));
    }

    @Test
    public void myAtoi3() throws Exception {
        String input = "214748364832543";
        int expected = Integer.MAX_VALUE;
        assertEquals(expected, MyAtoi.myAtoi(input));
    }

    @Test
    public void myAtoi4() throws Exception {
        String input = "0";
        int expected = 0;
        assertEquals(expected, MyAtoi.myAtoi(input));
    }

    @Test
    public void myAtoi5() throws Exception {
        String input = null;
        int expected = 0;
        assertEquals(expected, MyAtoi.myAtoi(input));
    }

    @Test
    public void myAtoi6() throws Exception {
        String input = "             0";
        int expected = 0;
        assertEquals(expected, MyAtoi.myAtoi(input));
    }

    @Test
    public void myAtoi7() throws Exception {
        String input = "             +10";
        int expected = 10;
        assertEquals(expected, MyAtoi.myAtoi(input));
    }

    @Test
    public void myAtoi8() throws Exception {
        String input = "             +A10";
        int expected = 0;
        assertEquals(expected, MyAtoi.myAtoi(input));
    }

    @Test
    public void myAtoi9() throws Exception {
        String input = "-1";
        int expected = -1;
        assertEquals(expected, MyAtoi.myAtoi(input));
    }

    @Test
    public void myAtoi10() throws Exception {
        String input = "9223372036854775809";
        int expected = Integer.MAX_VALUE;
        assertEquals(expected, MyAtoi.myAtoi(input));
    }
}