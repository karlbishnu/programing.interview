package net.bishnu.data.structure;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by karlb on 2016-11-06.
 */
public class LinkedListTest {
    List<Integer> list = new LinkedList<>();

    @Test
    public void addAnItem(){
        Integer input = 1;
        list.add(input);

        assertEquals(input.toString(), list.toString());
    }

    @Test
    public void addTwoItems(){
        list.add(1);
        list.add(2);

        assertEquals("2 -> 1", list.toString());
    }

    @Test
    public void get(){
        list.add(1);
        list.add(2);

        assertSame(2, list.get(0));
        assertSame(1, list.get(1));
    }

    @Test(expected = IllegalStateException.class)
    public void getFromEmptyListShouldThrowException(){
        list.get(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void getWithInvalidInexShouldThrowException(){
        list.add(1);
        list.get(1);
    }

    @Test
    public void removeConscutiveHeadItem(){
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(0);
        assertSame(2, list.get(0));
        list.remove(0);
        assertSame(1, list.get(0));

    }

    @Test(expected = IllegalStateException.class)
    public void removeFromEmptyListShouldThrowException(){
        list.get(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void removeWithInvalidInexShouldThrowException(){
        list.add(1);
        list.remove(1);
    }

    @Test
    public void findItemFromEnd(){
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);

        //Syst

        LinkedList<Integer> linkedList = (LinkedList)list;
        assertSame(7, linkedList.findItemFromEnd(0));
        assertSame(6, linkedList.findItemFromEnd(1));
        assertSame(5, linkedList.findItemFromEnd(2));
        assertSame(4, linkedList.findItemFromEnd(3));
        assertSame(3, linkedList.findItemFromEnd(4));
        assertSame(2, linkedList.findItemFromEnd(5));
        assertSame(1, linkedList.findItemFromEnd(6));
        assertSame(0, linkedList.findItemFromEnd(7));
        assertNull(linkedList.findItemFromEnd(8));
    }
}
