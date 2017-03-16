package net.bishnu.leetcode.kDiffPairsInArray;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-03-11.
 */
public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void findPairs1() throws Exception {
        int[] nums = new int[]{1,2,3,4,5};
        int k = 0;
        int expected = 0;
        Assert.assertEquals(expected, solution.findPairs(nums, k));
    }

    @Test
    public void findPairs2() throws Exception {
        int[] nums = new int[]{1,2,3,4,5};
        int k = 1;
        int expected = 4;
        Assert.assertEquals(expected, solution.findPairs(nums, k));
    }

    @Test
    public void findPairs3() throws Exception {
        int[] nums = new int[]{1,2,3,4,5};
        int k = 2;
        int expected = 3;
        Assert.assertEquals(expected, solution.findPairs(nums, k));
    }

    @Test
    public void findPairs4() throws Exception {
        int[] nums = new int[]{1,2,3,4,5};
        int k = 3;
        int expected = 2;
        Assert.assertEquals(expected, solution.findPairs(nums, k));
    }

    @Test
    public void findPairs5() throws Exception {
        int[] nums = new int[]{1,2,3,4,5};
        int k = 4;
        int expected = 1;
        Assert.assertEquals(expected, solution.findPairs(nums, k));
    }

    @Test
    public void findPairs6() throws Exception {
        int[] nums = new int[]{1,2,3,4,5};
        int k = 5;
        int expected = 0;
        Assert.assertEquals(expected, solution.findPairs(nums, k));
    }

    @Test
    public void findPairs7() throws Exception {
        int[] nums = new int[]{5,2,4,2,1,1};
        int k = 0;
        int expected = 2;
        Assert.assertEquals(expected, solution.findPairs(nums, k));
    }

    @Test
    public void findPairs8() throws Exception {
        int[] nums = new int[]{5,2,4,2,1,1};
        int k = 1;
        int expected = 2;
        Assert.assertEquals(expected, solution.findPairs(nums, k));
    }

    @Test
    public void findPairs9() throws Exception {
        int[] nums = new int[]{5,2,4,2,1,1};
        int k = 2;
        int expected = 1;
        Assert.assertEquals(expected, solution.findPairs(nums, k));
    }

    @Test
    public void findPairs10() throws Exception {
        int[] nums = new int[]{5,2,4,2,1,1};
        int k = 3;
        int expected = 2;
        Assert.assertEquals(expected, solution.findPairs(nums, k));
    }

    @Test
    public void findPairs11() throws Exception {
        int[] nums = new int[]{5,2,4,2,1,1};
        int k = 4;
        int expected = 1;
        Assert.assertEquals(expected, solution.findPairs(nums, k));
    }

    @Test
    public void findPairs12() throws Exception {
        int[] nums = new int[]{5,2,4,2,1,1};
        int k = 5;
        int expected = 0;
        Assert.assertEquals(expected, solution.findPairs(nums, k));
    }
}