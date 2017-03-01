package net.bishnu.leetcode.mock.androidUnlockPatterns;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by karlb on 2017-03-01.
 */
public class Solution {
    private static final int[][] bridge = new int[10][10];
    static{
        bridge[1][3] = bridge[3][1] = 2;
        bridge[1][7] = bridge[7][1] = 4;
        bridge[7][9] = bridge[9][7] = 8;
        bridge[3][9] = bridge[9][3] = 6;
        bridge[1][9] = bridge[9][1] = bridge[2][8] = bridge[8][2] = bridge[3][7] = bridge[7][3] = bridge[4][6] = bridge[6][4] = 5;
        /*bridge[1][9] = bridge[9][1]
                = bridge[2][8] = bridge[8][2] = bridge[2][7] = bridge[7][2] = bridge[2][9] = bridge[9][2]
                = bridge[3][7] = bridge[7][3]
                = bridge[4][6] = bridge[6][4] = bridge[4][3] = bridge[3][4] = bridge[4][9] = bridge[9][4]
                = bridge[6][1] = bridge[6][7]
                = bridge[8][1] = bridge[1][8] = bridge[8][3] = bridge[3][8]
                = 5;*/

    }
    public int numberOfPatterns(int m, int n) {
        int result = 0;
        boolean[] visited = new boolean[10];

        for(int i=m; i<=n; i++){
            for(int j=1; j<10; j++){
                result+=DFS(j, i-1, visited);
            }
        }
        return result;
    }

    private int DFS(int curIndex, int remain, boolean[] visited) {
        if(remain == 0) return 1;
        int result = 0;
        visited[curIndex] = true;

        for(int i=1; i<10; i++){
            if(!visited[i] && (bridge[curIndex][i] == 0 || visited[bridge[curIndex][i]])){
                result += DFS(i, remain-1, visited);
            }
        }

        visited[curIndex] = false;
        return result;
    }
}
