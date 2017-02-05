package net.bishnu.leetcode.constructTheRectangle;

/**
 * Created by karlb on 2017-02-05.
 * 492. Construct the Rectangle
 */
public class Solution {
    public int[] constructRectangle(int area) {
        int maxWidth = (int) Math.sqrt(area);
        int[] result = new int[2];
        for(int width=maxWidth; width>0; width--){
            if(area%width==0){
                int length = area/width;
                result[0] = length;
                result[1] = width;
                break;
            }
        }
        return result;
    }
}
