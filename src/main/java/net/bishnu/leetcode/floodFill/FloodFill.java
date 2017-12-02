package net.bishnu.leetcode.floodFill;

/**
 * 733. Flood Fill
 * https://leetcode.com/problems/flood-fill/description/
 */
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int initColor = image[sr][sc];
        traverse(image, sr, sc, newColor, initColor);
        return image;
    }

    private static final int[][] NEIGHBORS = new int[][]{{-1,0}, {1,0}, {0,-1}, {0,1}};
    private void traverse(int[][] image, int x, int y, int newColor, int initColor) {
        if(!isIn(image, x, y) || image[x][y]==newColor || image[x][y] != initColor)   return;
        image[x][y] = newColor;

        for(int[] NEIGHBOR: NEIGHBORS){
            traverse(image, x+NEIGHBOR[0], y+NEIGHBOR[1], newColor, initColor);
        }

    }

    private boolean isIn(int[][] image, int x, int y) {
        return x<image.length && x>=0 && y<image[0].length && y>=0;
    }
}
