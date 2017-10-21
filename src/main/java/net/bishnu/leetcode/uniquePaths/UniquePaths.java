package net.bishnu.leetcode.uniquePaths;

/**
 * 62. Unique Paths
 * https://leetcode.com/problems/unique-paths/description/
 */
public class UniquePaths {
    public static int uniquePaths(int m, int n){
        if(m==1 || n==1)    return 1;

        int[][] map = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int left = j==0 ? 0 : map[i][j-1];
                int up = i==0 ? 0 : map[i-1][j];
                map[i][j] = i==0&&j==0? 1 : left+up;
            }
        }
        return map[m-1][n-1];
    }
}
