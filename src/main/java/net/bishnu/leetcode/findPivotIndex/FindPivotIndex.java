package net.bishnu.leetcode.findPivotIndex;

/**
 * 724. Find Pivot Index
 * https://leetcode.com/problems/find-pivot-index/description/
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums){
        if(nums==null || nums.length<1) return -1;
        int left = 0;
        int right = 0;
        for(int i=1; i<nums.length; i++)    right+=nums[i];

        if(left==right) return 0;

        for(int i=1; i<nums.length; i++){
            left += nums[i-1];
            right -= nums[i];

            if(left==right) return i;
        }

        return -1;
    }
}
