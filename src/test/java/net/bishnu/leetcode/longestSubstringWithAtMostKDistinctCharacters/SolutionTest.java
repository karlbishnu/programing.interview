package net.bishnu.leetcode.longestSubstringWithAtMostKDistinctCharacters;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-03-11.
 */
public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void lengthOfLongestSubstringKDistinct1() throws Exception {
        String input = "eceba";
        int k = 2;
        int expected = 3;
        Assert.assertEquals(expected, solution.lengthOfLongestSubstringKDistinct(input, k));
    }

    @Test
    public void lengthOfLongestSubstringKDistinct2() throws Exception {
        String input = "a";
        int k = 2;
        int expected = 1;
        Assert.assertEquals(expected, solution.lengthOfLongestSubstringKDistinct(input, k));
    }

    @Test
    public void lengthOfLongestSubstringKDistinct3() throws Exception {
        String input = "aa";
        int k = 1;
        int expected = 2;
        Assert.assertEquals(expected, solution.lengthOfLongestSubstringKDistinct(input, k));
    }

    @Test
    public void lengthOfLongestSubstringKDistinct4(){
        String input = "bacc";
        int k = 2;
        int expected = 3;
        Assert.assertEquals(expected, solution.lengthOfLongestSubstringKDistinct(input, k));
    }

}