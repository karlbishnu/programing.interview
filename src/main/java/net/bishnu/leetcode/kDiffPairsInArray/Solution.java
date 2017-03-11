package net.bishnu.leetcode.kDiffPairsInArray;

import java.util.Arrays;

/**
 * Created by karlb on 2017-03-11.
 */
public class Solution {
    public int findPairs(int[] nums, int k) {
        int prev = Integer.MIN_VALUE;
        int result = 0;
        Arrays.sort(nums);

        for(int pivot=0, runner=1; runner<nums.length; runner++){
            int tmp = nums[runner] - nums[pivot];
            while(tmp>k && runner>pivot+1){
                tmp = nums[runner] - nums[++pivot];
            }

            if(tmp==k && prev != nums[runner]){
                result++;
                prev=nums[runner];
            }
        }
        return result;
    }
}
