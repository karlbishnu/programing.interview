package net.bishnu.leetcode.addTwoNumbers;

/**
 * Created by karlb on 2017-02-05.
 * 2. Add Two Numbers
 */
public class Solution {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = null, prev = null, currNode = null, currL1 = l1, currL2 = l2;

        do{
            int l1Val = currL1==null? 0 : currL1.val;
            int l2Val = currL2==null? 0 : currL2.val;

            int sum = l1Val + l2Val + carry;
            carry = sum/10;
            int val = sum%10;

            prev = currNode;
            currNode = new ListNode(val);
            if(head == null) head = currNode;
            else    prev.next = currNode;

            currL1 = currL1==null ? null : currL1.next;
            currL2 = currL2==null ? null : currL2.next;
        }while(currL1!=null || currL2!=null || carry==1);

        if(currL1!=null && currL2==null){
            currNode.next = currL1;
        }else if(currL2!=null && currL2==null){
            currNode.next = currL2;
        }
        return head;
    }
}
