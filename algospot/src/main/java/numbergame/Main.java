package numbergame;
/**
 * https://algospot.com/judge/problem/read/NUMBERGAME
 */

import java.util.Scanner;

public class Main {
    private static Scanner in;
    public static void main(String[] arg){
        in = new Scanner(System.in);
        int cases = in.nextInt();
        while(cases-- > 0) {
            main2();
        }
    }

    private static void main2() {
        int n = in.nextInt();
        int[] board = new int[n];
        for(int i=0; i<n; i++){
            board[i] = in.nextInt();
        }
        System.out.println(numberGame(board));
    }


    public static int numberGame(int[] board){
        return numberGame(board, 0, board.length-1, new Integer[board.length+1][board.length+1]);
    }

    private static int numberGame(int[] board, int left, int right, Integer[][] memo) {
        if(left>right) return 0;
        if(memo[left][right]!=null) return memo[left][right];

        int max = Integer.MIN_VALUE;
        max = Integer.max(max, board[left]-numberGame(board, left+1, right, memo));
        max = Integer.max(max, board[right]-numberGame(board, left, right-1, memo));

        if(right-left+1 >= 2){
            max=Integer.max(max, -numberGame(board, left+2, right, memo));
            max=Integer.max(max, -numberGame(board, left, right-2, memo));
        }
        return memo[left][right] = max;
    }
}
