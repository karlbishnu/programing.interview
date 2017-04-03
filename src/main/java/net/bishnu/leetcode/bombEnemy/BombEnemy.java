package net.bishnu.leetcode.bombEnemy;

/**
 * Created by karlb on 2017-04-03.
 */
public class BombEnemy {
    public int maxKilledEnemies(char[][] grid) {
        int n = grid.length;
        if (n<1) return n;

        int maxKill = 0;
        int[] position = new int[2];
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] != '0')   continue;

                int kills = 0;
                position[0] = i; position[1] = j;
                if(grid.length>1)   kills += searchVertical(position, grid);
                if(grid[0].length>1)   kills += searchHorizon(position, grid);
                maxKill = kills>maxKill ? kills : maxKill;
            }
        }
        return maxKill;
    }

    private int searchHorizon(int[] position, char[][] grid) {
        int bomb = position[1];
        char[] aLine = grid[position[0]];
        return searchLine(bomb, aLine);
    }

    private int searchVertical(int[] position, char[][] grid) {
        int bomb = position[0];
        char[] aLine = getColumn(grid, position[1]);
        return searchLine(bomb, aLine);
    }

    private char[] getColumn(char[][] grid, int bomb) {
        char[] col = new char[grid.length];
        for(int i=0; i<col.length; i++){
            col[i] = grid[i][bomb];
        }
        return col;
    }

    private int searchLine(int bomb, char[] aLine) {
        int left = 0;
        for(int i=bomb-1; i>=0; i--){
            char obj = aLine[i];
            if(obj=='W'){
                break;
            }else if(obj == 'E'){
                left++;
            }
        }
        int right = 0;
        for(int i=bomb+1; i<aLine.length; i++){
            char obj = aLine[i];
            if(obj=='W'){
                break;
            }else if(obj == 'E'){
                right++;
            }
        }
        return left+right;
    }


}
