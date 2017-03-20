package net.bishnu.leetcode.rangeSumQuery2dArray;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-03-20.
 */
public class NumMatrixTest {
    @Test
    public void test(){
        int[][] matrix = new int[][]{{1,1,1}, {1,1,1}, {1,1,1}, {1,1,1}, {1,1,1}, {1,1,1}};
        NumMatrix num = new NumMatrix(matrix);
    }

    @Test
    public void testSum(){
        int[][] matrix = new int[][]{{1,1,1}, {1,1,1}, {1,1,1}, {1,1,1}, {1,1,1}, {1,1,1}};
        NumMatrix num = new NumMatrix(matrix);
        Assert.assertEquals(3, num.sumRegion(3,0,3,2));
    }
}