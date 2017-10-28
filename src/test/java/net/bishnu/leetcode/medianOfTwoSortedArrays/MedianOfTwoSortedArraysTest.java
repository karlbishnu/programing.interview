package net.bishnu.leetcode.medianOfTwoSortedArrays;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 4. Median of Two Sorted Arrays
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 */
public class MedianOfTwoSortedArraysTest {
    @Test
    public void findMedianSortedArrays1() throws Exception {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{2};
        double expected = 2.00000;
        assertEquals(expected, MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2), 0);
    }

    @Test
    public void findMedianSortedArrays2() throws Exception {
        int[] nums1 = new int[]{1, 3};
        int[] nums2 = new int[]{};
        double expected = 2.00000;
        assertEquals(expected, MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2), 0);
    }

    @Test
    public void findMedianSortedArrays3() throws Exception {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        double expected = 1.00000;
        assertEquals(expected, MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2), 0);
    }

    @Test
    public void findMedianSortedArrays4() throws Exception {
        int[] nums1 = new int[]{1,2};
        int[] nums2 = new int[]{3,4};
        double expected = 2.50000;
        assertEquals(expected, MedianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2), 0);
    }
}