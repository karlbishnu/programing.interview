package net.bishnu.leetcode.missingRange;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-04-17.
 */
public class MissingRangeTest {
    @Test
    public void findMissingRanges() throws Exception {
    }

    @Test
    public void findMissingRangesShouldReturnSzie0List() throws Exception {
        assertEquals(0, MissingRange.findMissingRanges(new int[]{0,2,10}, 2, 2).size());
    }

    @Test
    public void findMissingRangesShouldReturnSzie1List() throws Exception {
        List<String> list = MissingRange.findMissingRanges(new int[]{0,10}, 2, 2);
        assertEquals(1, list.size());
        assertEquals("2", list.get(0));
    }

    @Test
    public void findMissingRanges2() throws Exception {
        int lower = 2;
        int upper = 4;
        List<String> list = MissingRange.findMissingRanges(new int[]{0,10}, lower, upper);
        assertEquals(1, list.size());
        assertEquals(lower+"->"+upper, list.get(0));
    }

    @Test
    public void findMissingRanges3() throws Exception {
        System.out.println(Integer.MIN_VALUE);
        int lower = -2147483648;
        int upper = 2147483647;
        List<String> list = MissingRange.findMissingRanges(new int[]{-2147483648,-2147483648,0,2147483647,2147483647}, lower, upper);
        List<String> expected = new LinkedList<>();
        expected.add("-2147483647->-1");
        expected.add("1->2147483646");
        assertEquals(expected, list);
    }

    @Test
    public void findMissingRanges4() throws Exception {
        int lower = -1;
        int upper = 11;
        List<String> list = MissingRange.findMissingRanges(new int[]{0,10}, lower, upper);
        List<String> expected = new LinkedList<>();
        expected.add(String.valueOf(lower));
        expected.add("1->9");
        expected.add(String.valueOf(upper));
        assertEquals(expected, list);
    }

    @Test
    public void test(){
        int[] array = new int[]{0, 1, 3, 50, 75};

        assertEquals(0, Arrays.binarySearch(array, 0));
        assertEquals(-1, Arrays.binarySearch(array, array[0]-1));
        assertEquals(-(array.length+1), Arrays.binarySearch(array, array[array.length-1]+1));
        assertEquals(array.length-1, Arrays.binarySearch(array, array[array.length-1]));
        assertEquals(-4, Arrays.binarySearch(array, 4));
        assertEquals(-3, Arrays.binarySearch(array, 2));
    }



}