package net.bishnu.leetcode.squareSum;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-07-06.
 */
public class SquareSumTest {
    @Test
    public void judgeSquareSum1() throws Exception {
        assertTrue(SquareSum.judgeSquareSum(5));
    }

    @Test
    public void judgeSquareSum() throws Exception {
        assertFalse(SquareSum.judgeSquareSum(3));
    }

    @Test
    public void judgeSquareSum3() throws Exception {
        assertTrue(SquareSum.judgeSquareSum(4));
    }


    @Test
    public void judgeSquareSum4() throws Exception {
        assertTrue(SquareSum.judgeSquareSum(2));
    }
}