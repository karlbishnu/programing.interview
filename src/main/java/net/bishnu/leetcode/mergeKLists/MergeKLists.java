package net.bishnu.leetcode.mergeKLists;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 23. Merge k Sorted Lists
 * https://leetcode.com/problems/merge-k-sorted-lists/description/
 */
public class MergeKLists {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;
        for(int i=1; i<lists.length; i<<=1){
            for(int j=0; j<lists.length; j+= i<<1){
                if(j+i >= lists.length) continue;
                lists[j] = merge2Lists(lists[j] , lists[j+i]);
            }
        }
        return lists[0];
    }

    private ListNode merge2Lists(ListNode l1, ListNode l2) {
        if(l1 == null)  return l2;
        if(l2 == null)  return l1;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(l1!=null && l2!=null){
            if(l1.val > l2.val){
                curr.next = l2;
                l2 = l2.next;
            }else{
                curr.next = l1;
                l1 = l1.next;
            }
            curr=curr.next;
        }
        curr.next = l1==null ? l2 : l1;
        return dummy.next;
    }
}
