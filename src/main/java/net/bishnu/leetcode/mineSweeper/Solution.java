package net.bishnu.leetcode.mineSweeper;

/**
 * Created by karlb on 2017-03-03.
 */
public class Solution {
    public char[][] updateBoard(char[][] board, int[] click){
        int value = board[click[0]][click[1]];

        if((value >='1' && value<='8') || value == 'B'){
            return board;
        }
        if(value == 'M'){
            board[click[0]][click[1]] = 'X';
        }
        if(value == 'E'){
            board = open(board, click);
        }

        return board;
    }

    private char[][] open(char[][] board, int[] click) {
        int row = click[0], col = click[1];
        if( !isInBoundary(board, row, col) || board[row][col] == 'M' || board[row][col] != 'E'){
            return board;
        }

        int mineCount = countMine(board, click);

        if(mineCount == 0){
            board[row][col] = 'B';
            for(int[] aOffset: offset){
                int[] position = new int[]{row+aOffset[0], col+aOffset[1]};
                board = open(board, position);
            }
        }else{
            board[row][col] = Character.forDigit(mineCount, 10);
        }
        return board;
    }

    private boolean isInBoundary(char[][] board, int row, int col){
        return row > -1 && col > -1 && row < board.length && col < board[0].length;
    }

    private int countMine(char[][] board, int[] click) {
        int row = click[0], col = click[1];
        int count = 0;

        for(int[] aOffset: offset){
            if(isInBoundary(board, row+aOffset[0], col+aOffset[1]) && board[row+aOffset[0]][col+aOffset[1]]=='M'){
                count++;
            }
        }
        return count;
    }

    private int[][] offset = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1}, {0, 1},
            {1, -1}, {1, 0}, {1, 1}
    };
}
