package net.bishnu.data.structure;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2016-11-05.
 */
public class LinkedListStackTest {
    @Test
    public void isEmptyWhenEmptyReturnTrue() throws Exception {
        assertTrue(new LinkedListStack<Integer>().isEmpty());
    }

    @Test
    public void isEmptyWhenNotEmptyReturnFalse() throws Exception {
        Stack<Integer> aStack = new LinkedListStack<Integer>();
        aStack.push(1);
        assertFalse(aStack.isEmpty());
    }

    @Test
    public void push() throws Exception {
        Stack<Integer>  aStack = new LinkedListStack<Integer>();
        aStack.push(1);
        assertEquals(1, aStack.size());
        assertFalse(aStack.isEmpty());
    }

    @Test
    public void pop() throws Exception {
        Stack<Integer> aStack = new LinkedListStack<Integer>();
        aStack.push(1);
        assertSame(1, aStack.pop());
        assertEquals(0, aStack.size());
        assertTrue(aStack.isEmpty());
    }

    @Test
    public void peek() throws Exception {
        Stack<Integer> aStack = new LinkedListStack<Integer>();
        aStack.push(1);
        assertSame(1, aStack.peek());
        assertEquals(1, aStack.size());
        assertFalse(aStack.isEmpty());
    }

    @Test
    public void size() throws Exception {

    }

}