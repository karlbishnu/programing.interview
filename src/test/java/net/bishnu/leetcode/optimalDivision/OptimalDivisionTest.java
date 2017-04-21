package net.bishnu.leetcode.optimalDivision;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-04-21.
 */
public class OptimalDivisionTest {
    @Test
    public void optimalDivision() throws Exception {
        int[] nums = new int[]{1000,100,10,2};
        String expected = "1000/(100/10/2)";

        assertEquals(expected, OptimalDivision.optimalDivision(nums));
    }

}