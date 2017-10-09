package net.bishnu.kakao.first2017.round1.no6;

import java.util.*;

public class Friends4Block {
    public int countBlocks(int m, int n, String[] input){
        char[][] board = new char[m][n];
        for(int i=0; i<m; i++){
            board[i] = input[i].toCharArray();
        }
        return round(board);
    }

    private int round(char[][] board) {
        int[][] moves = new int[board.length][board[0].length];
        int res = count(moves, board);
        if(res==0)  return res;
        else{
            removeBlocks(moves, board, res);
            return res + round(board);
        }
    }

    private void removeBlocks(int[][] moves, char[][] board, int count) {
        for(int i=moves.length-1; i>=0; i--){
            if(count==0)  break;
            for(int j=moves[0].length-1; j>=0; j--){
                if(count==0)  break;
                if(moves[i][j] > 0){
                    board[i+moves[i][j]][j] = board[i][j];
                    board[i][j]=' ';
                    count--;
                }
            }
        }
    }

    private int count(int[][] moves, char[][] board) {
        int res = 0;
        for(int i=board.length-1; i>=0; i--){
            for(int j=board[0].length-1; j>=0; j--){
                if(mark(board,i,j)){
                    res++;
                    if(i!=0)    moves[i-1][j]=1;
                }
                moves[i][j] = (i!=board.length-1 && moves[i][j]>0) ? moves[i+1][j]+1 : 0;
            }
        }
        return res;
    }

    private static final Integer[][] leftUpper = new Integer[][]{{-1, 0}, {-1,-1}, {0,-1}};
    private static final Integer[][] rightUpper = new Integer[][]{{-1, 0}, {-1, 1}, {0, 1}};
    private static final Integer[][] leftLower = new Integer[][]{{1, 0}, {1, -1}, {0, -1}};
    private static final Integer[][] rightLower = new Integer[][]{{1, 0}, {1, 1}, {0, 1}};
    private static List<Integer[][]> neighbors = new LinkedList<>();
    static {
        neighbors.add(leftUpper);
        neighbors.add(rightUpper);
        neighbors.add(leftLower);
        neighbors.add(rightLower);
    }
    private boolean mark(char[][] board, int i, int j) {
        if(board[i][j]==' ') return false;
        int count=0;
        for(Integer[][] square: neighbors){
            count = 0;
            for(Integer[] neighbor: square){
                int x=i+neighbor[0], y=j+neighbor[1];
                if((x<0 || y<0 || x>=board.length || y>=board[0].length) || board[i][j]!=board[x][y]){
                    break;
                }
                count++;
            }
            if(count==square.length)  break;
        }
        return count==leftLower.length;
    }
}
