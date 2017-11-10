package net.bishnu.leetcode.singleNumber;

/**
 * 136. Single Number
 * https://leetcode.com/problems/single-number/description/
 */
public class SingleNumber{
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i=0; i<nums.length; i++){
            res ^= nums[i];
        }
        return res;
    }
}
