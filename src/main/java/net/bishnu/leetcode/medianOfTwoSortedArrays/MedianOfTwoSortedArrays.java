package net.bishnu.leetcode.medianOfTwoSortedArrays;

/**
 * 4. Median of Two Sorted Arrays
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 */
public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2){
        int arrLenSum = nums1.length + nums2.length;
        int maxIter = arrLenSum/2 +1;
        boolean odd = arrLenSum % 2 != 0;
        int pre = 0, curr =0;

        for(int c=0, i1=0, i2=0; c<maxIter; c++){
            pre = curr;
            int num1 = i1<nums1.length ? nums1[i1] : Integer.MAX_VALUE;
            int num2 = i2<nums2.length ? nums2[i2] : Integer.MAX_VALUE;
            curr = num1 > num2 ? nums2[i2++] : nums1[i1++];
        }
        return odd ? curr : ((double) (pre+curr))/2;
    }
}
