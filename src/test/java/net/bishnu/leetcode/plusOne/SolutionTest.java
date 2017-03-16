package net.bishnu.leetcode.plusOne;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-03-06.
 */
public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void plusOne() throws Exception {
        int[] input = new int[]{9};
        int[] expected = new int[]{1,0};
        Assert.assertArrayEquals(expected, solution.plusOne(input));
    }

    @Test
    public void plusOne2() throws Exception {
        int[] input = new int[]{8};
        int[] expected = new int[]{9};
        Assert.assertArrayEquals(expected, solution.plusOne(input));
    }

    @Test
    public void plusOne3() throws Exception {
        int[] input = new int[]{1,1};
        int[] expected = new int[]{1,2};
        Assert.assertArrayEquals(expected, solution.plusOne(input));
    }

    @Test
    public void plusOne4() throws Exception {
        int[] input = new int[]{1,9};
        int[] expected = new int[]{2,0};
        Assert.assertArrayEquals(expected, solution.plusOne(input));
    }

}