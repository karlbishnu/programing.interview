package net.bishnu.leetcode.containerWithMostWater;

/**
 * 11. Container With Most Water
 * https://leetcode.com/problems/container-with-most-water/description/
 */
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int res=0;
        for(int i=0, j=height.length-1; i<j;){
            int x=j-i;
            int y=Math.min(height[i], height[j]);
            res = Math.max(res, x*y);
            if(height[i]<height[j]) i++;
            else j--;

        }
        return res;
    }
}
