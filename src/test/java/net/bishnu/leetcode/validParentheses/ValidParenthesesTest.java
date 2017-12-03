package net.bishnu.leetcode.validParentheses;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 20. Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses/discuss/
 */
public class ValidParenthesesTest {
    ValidParentheses validParentheses = new ValidParentheses();

    @Test
    public void isValid1() {
        String input = "()[]{}";
        assertTrue(validParentheses.isValid(input));
    }

    @Test
    public void isValid2() {
        String input = "(";
        assertFalse(validParentheses.isValid(input));
    }

    @Test
    public void isValid3() {
        String input = ")";
        assertFalse(validParentheses.isValid(input));
    }

    @Test
    public void isValid4() {
        String input = "(]";
        assertFalse(validParentheses.isValid(input));
    }

    @Test
    public void isValid5() {
        String input = "([)]";
        assertFalse(validParentheses.isValid(input));
    }
}