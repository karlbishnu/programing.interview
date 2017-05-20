package net.bishnu.leetcode.numberOfIslandsII;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 305. Number of Islands II
 * https://leetcode.com/problems/number-of-islands-ii/#/description
 * Created by karlb on 2017-05-02.
 */
public class NumberOfIslandsIITest {
    @Test
    public void numIslands2() throws Exception {
        NumberOfIslandsII solution = new NumberOfIslandsII();
        int m=3, n=3;
        int[][] positions = {{0,0}, {0,1}, {1,2}, {2,1}};
        List<Integer> expected = new LinkedList<>();
        expected.add(1);
        expected.add(1);
        expected.add(2);
        expected.add(3);

        assertEquals(expected, solution.numIslands2(m,n,positions));
    }

    @Test
    public void numIslands23() throws Exception {
        NumberOfIslandsII solution = new NumberOfIslandsII();
        int m=3, n=3;
        int[][] positions = {{0,0}, {0,1}, {1,2}, {0,2}, {2,1}};
        List<Integer> expected = new LinkedList<>();
        expected.add(1);
        expected.add(1);
        expected.add(2);
        expected.add(1);
        expected.add(2);

        assertEquals(expected, solution.numIslands2(m,n,positions));
    }


    @Test
    public void numIslands22() throws Exception {
        NumberOfIslandsII solution = new NumberOfIslandsII();
        int m=3, n=3;
        int[][] positions = {{0,1}, {1,2}, {2,1}, {1,0}, {0,2}, {0,0}, {1,1}};
        List<Integer> expected = new LinkedList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);

        assertEquals(expected, solution.numIslands2(m,n,positions));
    }

}