package net.bishnu.leetcode.zigzagIterator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-04-01.
 */
public class ZigzagIteratorTest {
    @Test
    public void next() throws Exception {
        List<Integer> v1 = new LinkedList<>();
        List<Integer> v2 = new LinkedList<>();

        v1.add(1); v1.add(2);
        v2.add(3); v2.add(4); v2.add(5); v2.add(6);
        ZigzagIterator zigzagIterator = new ZigzagIterator(v1, v2);

        List<Integer> expected = new LinkedList<>();
        expected.add(1); expected.add(3); expected.add(2); expected.add(4); expected.add(5); expected.add(6);

        Iterator<Integer> iterator = expected.iterator();
        while(zigzagIterator.hasNext()){
            Assert.assertEquals(iterator.next().intValue(), zigzagIterator.next());
        }
    }

    @Test
    public void withEmpty() throws Exception {
        List<Integer> v1 = new LinkedList<>();
        List<Integer> v2 = new LinkedList<>();

        ZigzagIterator zigzagIterator = new ZigzagIterator(v1, v2);

        List<Integer> expected = new LinkedList<>();

        Iterator<Integer> iterator = expected.iterator();
        while(zigzagIterator.hasNext()){
            Assert.assertEquals(iterator.next().intValue(), zigzagIterator.next());
        }
    }

}