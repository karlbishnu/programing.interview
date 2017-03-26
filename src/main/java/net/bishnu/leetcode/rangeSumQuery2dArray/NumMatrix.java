package net.bishnu.leetcode.rangeSumQuery2dArray;

/**
 * Created by karlb on 2017-03-20.
 */
public class NumMatrix {
    private int[][] matrix;
    private int[][] bit;

    public NumMatrix(int[][] matrix){
        if(matrix==null || matrix.length<1 || matrix[0].length<1 )
            return;
        this.matrix = new int[matrix.length][matrix[0].length];
        this.bit = new int[matrix.length+1][matrix[0].length+1];

        for(int i=0; i<this.matrix.length; i++){
            for(int j=0; j<this.matrix[0].length; j++){
                update(i, j, matrix[i][j]);
            }
        }
    }

    public void update(int row, int col, int val) {
        int diff = val - matrix[row][col];
        matrix[row][col] = val;

        for(int i=row+1; i<bit.length; i+=(i&(-i))){
            for(int j=col+1; j<bit[i].length; j+=(j&(-j))){
                bit[i][j] += diff;
            }
        }
    }

    private int sum(int row, int col){
        int result = 0;
        for(int i=row+1; i>0; i-=(i&(-i))){
            for(int j=col+1; j>0; j-=(j&(-j))){
                result+=bit[i][j];
            }
        }
        return result;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sum(row2, col2) + sum(row1-1, col1-1)
                - sum(row1-1, col2) - sum(row2, col1-1);
    }
}
