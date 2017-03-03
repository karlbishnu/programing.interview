package net.bishnu.leetcode.mineSweeper;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-03-03.
 */
public class SolutionTest {
    Solution solution = new Solution();
    @Test
    public void updateBoard() throws Exception {
        char[][] board = new char[][] {
                {'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'M', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'}};
        int[] click = new int[] {3,0};

        char[][] expected = new char[][] {
                {'B', '1', 'E', '1', 'B'},
                {'B', '1', 'M', '1', 'B'},
                {'B', '1', '1', '1', 'B'},
                {'B', 'B', 'B', 'B', 'B'}};

        char[][] result = solution.updateBoard(board, click);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void updateBoard1() throws Exception {
        char[][] board = new char[][] {
                {'B', '1', 'E', '1', 'B'},
                {'B', '1', 'M', '1', 'B'},
                {'B', '1', '1', '1', 'B'},
                {'B', 'B', 'B', 'B', 'B'}};
        int[] click = new int[] {1,2};

        char[][] expected = new char[][] {
                {'B', '1', 'E', '1', 'B'},
                {'B', '1', 'X', '1', 'B'},
                {'B', '1', '1', '1', 'B'},
                {'B', 'B', 'B', 'B', 'B'}};

        char[][] result = solution.updateBoard(board, click);
        Assert.assertArrayEquals(expected, result);
    }
}