package net.bishnu.leetcode.maximumSubarray;

/**
 * 53. Maximum SubArray
 * https://leetcode.com/problems/maximum-subarray/#/description
 */
public class MaximumSubArray {
    public static int maxSubArray(int[] nums){
        int maxSum=Integer.MIN_VALUE, sum=0;
        for(int num: nums){
            if(sum<0){
                sum=0;
            }
            sum+=num;
            maxSum=Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
