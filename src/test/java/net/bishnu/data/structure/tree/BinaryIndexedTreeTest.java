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
        int[] expected = new int[]{0, 1,3,3,7,8};
        BinaryIndexedTree bit = new BinaryIndexedTree(array);
        Assert.assertArrayEquals(expected, bit.getTree());
    }
    @Test
    public void update() throws Exception {

    }

}