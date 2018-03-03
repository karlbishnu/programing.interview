package net.bishnu.leetcode.mergeKLists;

import org.junit.Test;
import static net.bishnu.leetcode.mergeKLists.MergeKLists.ListNode;
import static org.junit.Assert.*;

/**
 * 23. Merge k Sorted Lists
 * https://leetcode.com/problems/merge-k-sorted-lists/description/
 */
public class MergeKListsTest {
    MergeKLists mergeKLists = new MergeKLists();

    @Test
    public void mergeKLists() {
        assertNull(mergeKLists.mergeKLists(null));
    }
}