package net.bishnu.leetcode.threeSumSmaller;

import java.util.Arrays;

/**
 * 259. 3Sum Smaller
 * https://leetcode.com/problems/3sum-smaller/#/description
 * Created by karlb on 2017-04-19.
 */
public class ThreeSumSmaller {
    public static int threeSumSmaller(int[] nums, int target){
        Arrays.sort(nums);
        int result = 0;
        for(int i=0; i<nums.length-2; i++){
            int targeti = nums[i];
            for(int j=i+1; j<nums.length-1; j++){
                int targetj = targeti+nums[j];
                for(int k=nums.length-1; k>j; k--){
                    if(targetj+nums[k]<target)   result++;
                }
            }
        }
        return result;
    }
}
