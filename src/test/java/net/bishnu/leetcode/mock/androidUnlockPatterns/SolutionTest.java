package net.bishnu.leetcode.mock.androidUnlockPatterns;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-03-01.
 */
public class SolutionTest {
    final Solution solution = new Solution();

    @Test
    public void numberOfPatterns1To1() throws Exception {
        Assert.assertEquals(9, solution.numberOfPatterns(1,1));
    }

    @Test
    public void numberOfPatterns2To2() throws Exception {
        Assert.assertEquals(56, solution.numberOfPatterns(2,2));
    }

    @Test
    public void numberOfPatterns1To2() throws Exception {
        Assert.assertEquals(65, solution.numberOfPatterns(1,2));
    }

}