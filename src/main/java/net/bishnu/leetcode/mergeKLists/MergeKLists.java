package net.bishnu.leetcode.mergeKLists;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKLists {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null) return null;
        PriorityQueue<ListNode> heap =
                new PriorityQueue<>(lists.length, Comparator.comparingInt(o -> o.val));
        ListNode header = null;
        for(ListNode list: lists){
            if(list==null)  continue;
            heap.add(list);
        }
        if(heap.isEmpty())  return null;
        header = heap.poll();
        if(header.next!=null)   heap.add(header.next);

        ListNode curr=header;
        while(!heap.isEmpty()){
            curr.next = heap.poll();
            if(curr.next.next != null)  heap.add(curr.next.next);
            curr = curr.next;
        }
        return header;
    }
}
