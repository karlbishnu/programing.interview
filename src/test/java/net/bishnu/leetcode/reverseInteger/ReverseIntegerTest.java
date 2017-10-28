package net.bishnu.leetcode.reverseInteger;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 7. Reverse Integer
 * https://leetcode.com/problems/reverse-integer/description/
 */
public class ReverseIntegerTest {
    @Test
    public void reverse1() throws Exception {
        int input = 0;
        int expected= 0;
        assertEquals(expected, ReverseInteger.reverse(input));
    }

    @Test
    public void reverse2() throws Exception {
        int input = 1000;
        int expected= 1;
        assertEquals(expected, ReverseInteger.reverse(input));
    }

    @Test
    public void reverse3() throws Exception {
        int input = -123;
        int expected= -321;
        assertEquals(expected, ReverseInteger.reverse(input));
    }

    @Test
    public void reverse4() throws Exception {
        int input = 123;
        int expected= 321;
        assertEquals(expected, ReverseInteger.reverse(input));
    }

    @Test
    public void reverse5() throws Exception {
        int input = 2147483647;
        int expected= 0;
        assertEquals(expected, ReverseInteger.reverse(input));
    }

    @Test
    public void reverse6() throws Exception {
        int input = -2147483648;
        int expected= 0;
        assertEquals(expected, ReverseInteger.reverse(input));
    }
}