package net.bishnu.leetcode.regularExpressionMatching;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 10. Regular Expression Matching
 * https://leetcode.com/problems/regular-expression-matching/description/
 */
public class RegularExpressionMatchingTest {

    @Test
    public void isMatch1() throws Exception {
        assertFalse(RegularExpressionMatching.isMatch("aa", "a"));
    }

    @Test
    public void isMatch2() throws Exception {
        assertTrue(RegularExpressionMatching.isMatch("aa", "aa"));
    }

    @Test
    public void isMatch3() throws Exception {
        assertFalse(RegularExpressionMatching.isMatch("aaa", "aa"));
    }

    @Test
    public void isMatch4() throws Exception {
        assertTrue(RegularExpressionMatching.isMatch("aa", "a*"));
    }

    @Test
    public void isMatch5() throws Exception {
        assertTrue(RegularExpressionMatching.isMatch("aa", ".*"));
    }

    @Test
    public void isMatch6() throws Exception {
        assertTrue(RegularExpressionMatching.isMatch("ab", ".*"));
    }

    @Test
    public void isMatch7() throws Exception {
        assertTrue(RegularExpressionMatching.isMatch("aab", "c*a*b"));
    }

}