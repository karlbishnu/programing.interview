package net.bishnu.leetcode.houseRobber;

/**
 * 198. House Robber
 * https://leetcode.com/problems/house-robber/#/description
 */
public class HouseRobber {
    public static int rob(int[] nums){
        int prevMax=0;
        int currMax=0;
        for(int amount: nums){
            int tmp=currMax;
            currMax=Math.max(prevMax+amount, currMax);
            prevMax=tmp;
        }
        return currMax;
    }
}
