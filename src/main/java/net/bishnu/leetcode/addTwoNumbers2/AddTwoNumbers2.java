package net.bishnu.leetcode.addTwoNumbers2;


import java.util.Objects;

/**
 * 445. Add Two Numbers II
 * https://leetcode.com/problems/add-two-numbers-ii/#/description
 */
public class AddTwoNumbers2 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }

        public int toInteger(){
            int res = 0;
            ListNode curr = this;
            while(curr!=null){
                res=res*10+curr.val;
                curr = curr.next;
            }
            return res;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ListNode listNode = (ListNode) o;
            return val == listNode.val &&
                    Objects.equals(next, listNode.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, next);
        }
    }
    private static int carry = 0;
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode l1Curr=l1, l2Curr=l2;
        int l1Len=0, l2Len=0;
        while(l1Curr!=null || l2Curr!=null){
            if(l1Curr != null){
                l1Len++;
                l1Curr=l1Curr.next;
            }
            if(l2Curr != null){
                l2Len++;
                l2Curr=l2Curr.next;
            }
        }
        ListNode longer = l2Len>l1Len ? l2 : l1;
        ListNode shorter = longer==l2? l1 : l2;
        int diff = Math.abs(l2Len - l1Len);
        for(int i=0; i<diff; i++){
            ListNode tmp = new ListNode(0);
            tmp.next = shorter;
            shorter = tmp;
        }
        ListNode header = sum(longer, shorter);
        if(carry>0){
            ListNode newHeader = new ListNode(carry);
            newHeader.next = header;
            header=newHeader;
        }
        return header;
    }

    private static ListNode sum(ListNode l1, ListNode l2) {
        if(l1==null && l2==null)    return null;
        ListNode prev = sum(l1.next, l2.next);
        int sum=l1.val+l2.val+carry;
        carry = sum/10;
        ListNode header = new ListNode(sum%10);
        header.next=prev;
        return header;
    }
}
