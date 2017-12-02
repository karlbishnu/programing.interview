package net.bishnu.leetcode.maximumProductSubarray;

/**
 * 152. Maximum Product Subarray
 * https://leetcode.com/problems/maximum-product-subarray/description/
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        long ans = nums[0], iMax=ans, iMin = ans;
        for(int i=1; i<nums.length; i++){
            if(nums[i] < 0){
                long tmp = iMax;
                iMax = iMin;
                iMin = tmp;
            }
            iMax = Math.max(nums[i], iMax*nums[i]);
            iMin = Math.min(nums[i], iMin*nums[i]);
            ans = Math.max(ans, iMax);
        }

        return ans>Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) ans;
    }
}
