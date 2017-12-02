package net.bishnu.leetcode.findPivotIndex;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindPivotIndexTest {
    private FindPivotIndex findPivotIndex;

    @Before
    public void setUp() throws Exception {
        findPivotIndex = new FindPivotIndex();
    }

    @Test
    public void pivotIndex1() {
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        int expected = 3;
        assertEquals(expected, findPivotIndex.pivotIndex(nums));
    }

    @Test
    public void pivotIndex2() {
        int[] nums = new int[]{1, 2,3};
        int expected = -1;
        assertEquals(expected, findPivotIndex.pivotIndex(nums));
    }

    @Test
    public void pivotIndex3() {
        int[] nums = new int[]{0, 0,0};
        int expected = 0;
        assertEquals(expected, findPivotIndex.pivotIndex(nums));
    }

    @Test
    public void pivotIndex4() {
        int[] nums = null;
        int expected = -1;
        assertEquals(expected, findPivotIndex.pivotIndex(nums));
    }

    @Test
    public void pivotIndex5() {
        int[] nums = new int[]{};
        int expected = -1;
        assertEquals(expected, findPivotIndex.pivotIndex(nums));
    }
}