package net.bishnu.leetcode.numberOfConerRectangles;

/**
 * 750. Number Of Corner Rectangles
 * https://leetcode.com/problems/number-of-corner-rectangles/description/
 */
public class CornerRectangles {
    public int countCornerRectangles(int[][] grid) {
        if(grid==null || grid.length<2 || grid[0].length<2) return 0;
        int res = 0;
        for(int i=0; i<grid.length-1; i++){
            for(int j=0; j<grid[0].length-1; j++){
                if(grid[i][j]==0)   continue;
                res += countRect(grid, i, j);
            }
        }
        return res;
    }

    private int countRect(int[][] grid, int x, int y) {
        int res = 0;
        for(int i=x+1; i<grid.length; i++){
            if(grid[i][y]==0)   continue;
            for(int j=y+1; j<grid[0].length; j++){
                if(grid[x][j]==0)   continue;
                else if(grid[i][j]==1)  res++;
            }
        }
        return res;
    }
}
