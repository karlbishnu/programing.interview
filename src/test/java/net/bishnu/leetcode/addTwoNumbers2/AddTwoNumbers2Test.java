package net.bishnu.leetcode.addTwoNumbers2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 445. Add Two Numbers II
 * https://leetcode.com/problems/add-two-numbers-ii/#/description
 */
public class AddTwoNumbers2Test {
    @Test
    public void addTwoNumbers() throws Exception {
        int a= 7243, b=564;
        AddTwoNumbers2.ListNode l1 = valueOf(a), l2 = valueOf(b);
        assertEquals(a+b, AddTwoNumbers2.addTwoNumbers(l1, l2).toInteger());
    }

    @Test
    public void addTwoNumbers2() throws Exception {
        int a= 7243, b=0;
        AddTwoNumbers2.ListNode l1 = valueOf(a), l2 = valueOf(b);
        assertEquals(a+b, AddTwoNumbers2.addTwoNumbers(l1, l2).toInteger());
    }

    @Test
    public void addTwoNumbers3() throws Exception {
        int a= 7243, b=757;
        AddTwoNumbers2.ListNode l1 = valueOf(a), l2 = valueOf(b);
        assertEquals(a+b, AddTwoNumbers2.addTwoNumbers(l1, l2).toInteger());
    }

    private AddTwoNumbers2.ListNode valueOf(int num){
        if(num==0)  return new AddTwoNumbers2.ListNode(0);
        int val = num;
        AddTwoNumbers2.ListNode header = null;
        while(val!=0){
            AddTwoNumbers2.ListNode node = new AddTwoNumbers2.ListNode(val%10);
            node.next = header;
            header = node;
            val/=10;
        }

        return header;
    }
}