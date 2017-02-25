package net.bishnu.leetcode.contiguousArray;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-02-25.
 */
public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void findMaxLength() throws Exception {
        int[] nums = new int[]{0, 1};
        int expected = 2;

        int result = solution.findMaxLength(nums);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void findMaxLength2() throws Exception {
        int[] nums = new int[]{0, 1, 0};
        int expected = 2;

        int result = solution.findMaxLength(nums);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void findMaxLength3() throws Exception {
        int[] nums = new int[]{0};
        int expected = 0;

        int result = solution.findMaxLength(nums);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void findMaxLength4() throws Exception {
        int[] nums = new int[]{0, 1, 1};
        int expected = 2;

        int result = solution.findMaxLength(nums);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void findMaxLength5() throws Exception {
        int[] nums = new int[]{0, 1, 0, 1};
        int expected = 4;

        int result = solution.findMaxLength(nums);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void findMaxLength6() throws Exception {
        int[] nums = new int[]{1,1,1,1,1,1,1,1};
        int expected = 0;

        int result = solution.findMaxLength(nums);

        Assert.assertEquals(expected, result);
    }

}