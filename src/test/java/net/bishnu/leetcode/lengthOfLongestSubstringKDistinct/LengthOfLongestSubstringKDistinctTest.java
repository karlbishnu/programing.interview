package net.bishnu.leetcode.lengthOfLongestSubstringKDistinct;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 340. Longest Substring with At Most K Distinct Characters
 * https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/description/
 */
public class LengthOfLongestSubstringKDistinctTest {
    private LengthOfLongestSubstringKDistinct solution = new LengthOfLongestSubstringKDistinct();

    @Test
    public void lengthOfLongestSubstringKDistinct1() {
        String s = null;
        int k = 1;
        int expected = 0;

        assertEquals(expected, solution.lengthOfLongestSubstringKDistinct(s, k));
    }

    @Test
    public void lengthOfLongestSubstringKDistinct2() {
        String s = "test";
        int k = 0;
        int expected = 0;

        assertEquals(expected, solution.lengthOfLongestSubstringKDistinct(s, k));
    }

    @Test
    public void lengthOfLongestSubstringKDistinct3() {
        String s = "eececabb";
        int k = 2;
        int expected = 5;

        assertEquals(expected, solution.lengthOfLongestSubstringKDistinct(s, k));
    }

    @Test
    public void lengthOfLongestSubstringKDistinct4() {
        String s = "eececabb";
        int k = 3;
        int expected = 6;

        assertEquals(expected, solution.lengthOfLongestSubstringKDistinct(s, k));
    }

    @Test
    public void lengthOfLongestSubstringKDistinct5() {
        String s = "eceba";
        int k = 2;
        int expected = 3;

        assertEquals(expected, solution.lengthOfLongestSubstringKDistinct(s, k));
    }
}