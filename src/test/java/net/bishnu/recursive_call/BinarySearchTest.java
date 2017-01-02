package net.bishnu.recursive_call;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;

import static java.math.BigDecimal.ROUND_FLOOR;
import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-01-02.
 */
public class BinarySearchTest {
    private final int[] array = new int[1000000];
    private final int linearComplexity = array.length;
    private final int logComplexity = new BigDecimal(Math.log(array.length)).setScale(0, ROUND_FLOOR).intValue();
    @Before
    public void setUp() throws IOException {
        Arrays.setAll(array, (x)->(x));
    }

    @Test
    public void binSearch() throws Exception {
        int index = BinarySearch.binSearch(array, array.length-1);
        Assert.assertEquals(array.length-1, index);
        System.out.println("logComplexity="+logComplexity);
        System.out.println("call="+BinarySearch.call);
    }

    @Test
    public void binSearchNotFound() throws Exception {
        int index = BinarySearch.binSearch(array, array.length);
        Assert.assertEquals(-1, index);
        System.out.println("logComplexity="+logComplexity);
        System.out.println("call="+BinarySearch.call);
    }

}