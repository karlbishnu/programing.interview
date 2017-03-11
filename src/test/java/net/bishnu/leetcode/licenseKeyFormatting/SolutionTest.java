package net.bishnu.leetcode.licenseKeyFormatting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-03-11.
 */
public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void licenseKeyFormatting1() throws Exception {
        String input = "2-4A0r7-4k";
        int k = 4;
        String expected = "24A0-R74K";
        Assert.assertEquals(expected, solution.licenseKeyFormatting(input, k));
    }

    @Test
    public void licenseKeyFormatting2() throws Exception {
        String input = "2-4A0r7-4k";
        int k = 3;
        String expected = "24-A0R-74K";
        Assert.assertEquals(expected, solution.licenseKeyFormatting(input, k));
    }

}