package net.bishnu.leetcode.numberOfIslandsII;

import java.util.*;

/**
 * 305. Number of Islands II
 * https://leetcode.com/problems/number-of-islands-ii/#/description
 * Created by karlb on 2017-05-02.
 */
public class NumberOfIslandsII {

    private int[][] directions = new int[][]{{1,0}, {-1,0}, {0,0}, {0,1}, {0,-1}};
    public List<Integer> numIslands2(int m, int n, int[][] positions){
        int[][] grid = new int[m][n];
        List<Integer> result = new ArrayList<>(positions.length);
        for(int i=0; i<positions.length; i++){
            int row = positions[i][0];
            int col = positions[i][1];
            result.add(addLand(grid, row, col));
        }
        return result;
    }

    private Integer addLand(int[][] grid, int row, int col) {
        grid[row][col]=1;
        int m = grid.length;
        int n = grid[0].length;
        int count=0;
        boolean[][] visited = new boolean[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    count++;
                    bfs(grid, visited, i, j);
                }
            }
        }
        return count;
    }

    private void bfs(int[][] grid, boolean[][] visited, int i, int j) {
        Queue<Integer[]> queue = new LinkedList<>();
        queue.add(new Integer[]{i,j});
        while(!queue.isEmpty()){
            Integer[] point = queue.poll();
            visited[point[0]][point[1]] = true;
            for(int[] direction: directions){
                int newRow = point[0]+direction[0];
                int newCol = point[1]+direction[1];
                if(newRow>=0&&newRow<grid.length && newCol>=0&&newCol<grid[0].length){
                    if(grid[newRow][newCol]==1 && !visited[newRow][newCol]){
                        queue.add(new Integer[]{newRow, newCol});
                    }
                }
            }
        }
    }
}
