package net.bishnu.leetcode.reverseString;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 344. Reverse String
 * https://leetcode.com/problems/reverse-string/description/
 */
public class ReverseStringTest {
    @Test
    public void reverseString() throws Exception {
        String input = "hello";
        String expected = "olleh";

        assertEquals(expected, ReverseString.reverseString(input));
    }

    @Test
    public void reverseString2() throws Exception {
        String input = "유명한";
        String expected = "한명유";

        assertEquals(expected, ReverseString.reverseString(input));
    }
}