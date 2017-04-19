package net.bishnu.leetcode.wiggleSort;

import java.util.Arrays;

/**
 * 280. Wiggle Sort
 * https://leetcode.com/problems/wiggle-sort/#/description
 * Created by karlb on 2017-04-19.
 */
public class WiggleSort {
    public static void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        result[0] = nums[0];
        int backward = nums.length-1, forward = 1;
        for(int i=1; i<result.length; i++){
            result[i] = nums[i%2==0 ? forward++ : backward--];
        }
        System.arraycopy(result, 0, nums, 0, result.length);
    }
}
