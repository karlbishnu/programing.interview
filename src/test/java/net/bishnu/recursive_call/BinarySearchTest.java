package net.bishnu.recursive_call;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;

import static java.math.BigDecimal.ROUND_FLOOR;

/**
 * Created by karlb on 2017-01-02.
 */
public class BinarySearchTest {
    private final int[] evenNumers = new int[1000000];
    private final int linearComplexity = evenNumers.length;
    private final int logComplexity = new BigDecimal(Math.log(evenNumers.length)).setScale(0, ROUND_FLOOR).intValue();
    @Before
    public void setUp() throws IOException {
        Arrays.setAll(evenNumers, (x)->(x*2));
    }

    @Test
    public void binSearch() throws Exception {
        int index = BinarySearch.binSearch(evenNumers, evenNumers[evenNumers.length-1]);
        Assert.assertEquals(evenNumers.length-1, index);
        System.out.println("logComplexity="+logComplexity);
        System.out.println("call="+BinarySearch.call);
    }

    @Test
    public void binSearchNotFound() throws Exception {
        int index = BinarySearch.binSearch(evenNumers, 13);
        Assert.assertEquals(-1, index);
        System.out.println("logComplexity="+logComplexity);
        System.out.println("call="+BinarySearch.call);
    }

}