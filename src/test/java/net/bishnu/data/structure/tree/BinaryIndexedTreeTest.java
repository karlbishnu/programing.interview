package net.bishnu.data.structure.tree;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-03-14.
 */
public class BinaryIndexedTreeTest {

    @Test
    public void init() throws Exception{
        int[] array = new int[5];
        Arrays.setAll(array, i->i+1);
        int[] expected = new int[]{0, 1,3,3,10,5};
        BinaryIndexedTree bit = new BinaryIndexedTree(array);
        Assert.assertArrayEquals(expected, bit.getTree());
    }

    @Test
    public void update() throws Exception {
        int[] array = new int[5];
        Arrays.setAll(array, i->i+1);
        int[] expected = new int[]{0, 1,3,3,10,5};
        BinaryIndexedTree bit = new BinaryIndexedTree(array);
        Assert.assertArrayEquals(expected, bit.getTree());

        bit.update(0, 3);
        expected = new int[]{0, 3,5,3,12,5};
        Assert.assertArrayEquals(expected, bit.getTree());
    }

    @Test
    public void getSumSingle() throws Exception {
        int[] array = new int[5];
        Arrays.setAll(array, i -> i + 1);
        int[] expected = new int[]{0, 1, 3, 3, 10, 5};
        BinaryIndexedTree bit = new BinaryIndexedTree(array);
        Assert.assertArrayEquals(expected, bit.getTree());

        Assert.assertEquals(1, bit.getSum(0));
        Assert.assertEquals(3, bit.getSum(1));
        Assert.assertEquals(6, bit.getSum(2));
        Assert.assertEquals(10, bit.getSum(3));
        Assert.assertEquals(15, bit.getSum(4));
    }

    @Test
    public void getSum2() throws Exception {
        int[] array = new int[5];
        Arrays.setAll(array, i -> i + 1);
        int[] expected = new int[]{0, 1, 3, 3, 10, 5};
        BinaryIndexedTree bit = new BinaryIndexedTree(array);
        Assert.assertArrayEquals(expected, bit.getTree());

        Assert.assertEquals(5, bit.getSum(1, 2));
        Assert.assertEquals(7, bit.getSum(2, 3));
        Assert.assertEquals(9, bit.getSum(3, 4));
        Assert.assertEquals(9, bit.getSum(1, 3));
        Assert.assertEquals(14, bit.getSum(1, 4));
        Assert.assertEquals(0, bit.getSum(0, 0));
    }

}