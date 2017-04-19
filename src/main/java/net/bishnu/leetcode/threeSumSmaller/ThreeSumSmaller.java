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
            if(targeti>target) break;
            for(int j=i+1; j<nums.length-1; j++){
                int targetj = targeti+nums[j];
                if(targetj>target) break;
                for(int k=j+1; k<nums.length; k++){
                    if(targetj+nums[k]>=target)   break;
                    result++;
                }
            }
        }
        return result;
    }
}
