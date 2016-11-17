package net.bishnu.data.structure.list;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2016-11-17.
 */
public class LinkedQueueTest {
    private LinkedQueue<Integer> queue;
    private static final int[] hundredSamples = new int[100];

    @Before
    public void setUp(){
        queue = new LinkedQueue<>();
        Arrays.setAll(hundredSamples, operand -> operand);
    }

    @Test
    public void testToStringWithNoElement(){
        assertEquals("Head -><- Tail", queue.toString());
    }

    @Test
    public void testEnqueue(){
        queue.enqueue(1);
        System.out.println(queue);
        assertEquals(1, queue.size());
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testDequeue(){
        int item = 1;
        queue.enqueue(item);
        int result = queue.dequeue();
        assertEquals(item, result);
        assertEquals(0, queue.size());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testPeek(){
        int item = 1;
        queue.enqueue(item);
        System.out.println(queue);
        assertEquals(1, queue.size());

        int result = queue.peek();
        assertEquals(item, result);
        assertEquals(1, queue.size());
        assertFalse(queue.isEmpty());
    }

    @Test(timeout = 5)
    public void testQueueWithHundredItems(){
        for(int i: hundredSamples){
            queue.enqueue(i);
        }

        assertEquals(hundredSamples.length, queue.size());
        System.out.println(queue);

        for(int i=0; i<hundredSamples.length; i++){
            assertEquals(hundredSamples[i], queue.dequeue().intValue());
        }

        assertTrue(queue.isEmpty());
    }
}
