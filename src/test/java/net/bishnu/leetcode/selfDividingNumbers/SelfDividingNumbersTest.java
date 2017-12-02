package net.bishnu.leetcode.selfDividingNumbers;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 728. Self Dividing Numbers
 * https://leetcode.com/problems/self-dividing-numbers/description/
 */
public class SelfDividingNumbersTest {
    private SelfDividingNumbers selfDividingNumbers;

    @Before
    public void setUp(){
        selfDividingNumbers = new SelfDividingNumbers();
    }

    @Test
    public void selfDividingNumbers() {
        int left = 1;
        int right = 22;
        List<Integer> expected = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22});
        assertEquals(expected, selfDividingNumbers.selfDividingNumbers(left, right));
    }
}