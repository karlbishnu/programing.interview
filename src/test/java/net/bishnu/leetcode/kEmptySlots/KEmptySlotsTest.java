package net.bishnu.leetcode.kEmptySlots;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 683. K Empty Slots
 * https://leetcode.com/problems/k-empty-slots/description/
 */
public class KEmptySlotsTest {
    private KEmptySlots kEmptySlots = new KEmptySlots();
    @Test
    public void kEmptySlots1() {
        int[] flowers = new  int[]{1,3,2};
        int k =1;
        int expected = 2;
        assertEquals(expected, kEmptySlots.kEmptySlots(flowers, k));
    }

    @Test
    public void kEmptySlots2() {
        int[] flowers = new  int[]{1,2,3};
        int k =1;
        int expected = -1;
        assertEquals(expected, kEmptySlots.kEmptySlots(flowers, k));
    }
}