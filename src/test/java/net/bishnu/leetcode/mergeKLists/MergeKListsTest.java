package net.bishnu.leetcode.mergeKLists;

import org.junit.Test;
import static net.bishnu.leetcode.mergeKLists.MergeKLists.ListNode;
import static org.junit.Assert.*;

public class MergeKListsTest {
    MergeKLists mergeKLists = new MergeKLists();

    @Test
    public void mergeKLists() {
        assertNull(mergeKLists.mergeKLists(null));
    }
}