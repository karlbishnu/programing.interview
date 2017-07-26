package net.bishnu.leetcode.minimumMovesToEqualArrayElements;

/**
 * 453. Minimum Moves to Equal Array Elements
 * https://leetcode.com/problems/minimum-moves-to-equal-array-elements/#/description
 */
public class MinimumMovesToEqualArrayElements {
    public static int minMoves(int[] nums){
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int num: nums){
            min=Math.min(min, num);
            sum+=num;
        }
        return sum-min*nums.length;
    }
}
