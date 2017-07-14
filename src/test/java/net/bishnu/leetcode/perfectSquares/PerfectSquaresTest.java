package net.bishnu.leetcode.perfectSquares;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-07-13.
 */
public class PerfectSquaresTest {
    @Test
    public void numSquares() throws Exception {
        int[] answers = new int[]{1, 2, 3, 1, 2, 3, 4, 2, 1, 2, 3, 3, 2, 3, 4, 1, 2, 2, 3, 2, 3, 3, 4, 3, 1, 2, 3};

        for(int i=0; i<answers.length; i++){
            assertEquals("n="+(i+1), answers[i], PerfectSquares.numSquares(i+1));
        }
    }

}