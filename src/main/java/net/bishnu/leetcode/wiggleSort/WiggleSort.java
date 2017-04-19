package net.bishnu.leetcode.wiggleSort;

import java.util.Arrays;

/**
 * 280. Wiggle Sort
 * https://leetcode.com/problems/wiggle-sort/#/description
 * Created by karlb on 2017-04-19.
 */
public class WiggleSort {
    public static void wiggleSort(int[] nums) {
        if(nums==null)  return;
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                if(nums[i]>nums[i+1])
                    swap(nums, i, i+1);
            }else {
                if(nums[i]<nums[i+1])
                    swap(nums, i, i+1);
            }
        }
    }

    private static void swap(int[] nums, int i, int i1) {
        int tmp = nums[i];
        nums[i] = nums[i1];
        nums[i1] = tmp;
    }
}
