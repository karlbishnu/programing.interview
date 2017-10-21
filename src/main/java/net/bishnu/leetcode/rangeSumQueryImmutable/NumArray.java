package net.bishnu.leetcode.rangeSumQueryImmutable;

/**
 * 303. Range Sum Query - Immutable
 * https://leetcode.com/problems/range-sum-query-immutable/description/
 */
public class NumArray {
    private final int[] sums;

    public NumArray(int[] nums){
        sums=new int[nums.length];
        if(nums.length>0)   sums[0]=nums[0];
        for(int i=1; i<sums.length; i++){
            sums[i] = sums[i-1] + nums[i];
        }
    }

    public int sumRange(int i, int j){
        return i<=0 ? sums[j] : sums[j]-sums[i-1];
    }
}
