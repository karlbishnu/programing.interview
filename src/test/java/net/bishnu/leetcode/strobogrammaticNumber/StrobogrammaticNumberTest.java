package net.bishnu.leetcode.strobogrammaticNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-04-23.
 */
public class StrobogrammaticNumberTest {
    StrobogrammaticNumber solution = new StrobogrammaticNumber();
    @Test
    public void isStrobogrammatic() throws Exception {
        String input = "69";
        boolean expected = true;
        assertEquals(expected, solution.isStrobogrammatic(input));
    }

    @Test
    public void isStrobogrammatic2() throws Exception {
        String input = "818";
        boolean expected = true;
        assertEquals(expected, solution.isStrobogrammatic(input));
    }

    @Test
    public void isStrobogrammatic3() throws Exception {
        String input = "88";
        boolean expected = true;
        assertEquals(expected, solution.isStrobogrammatic(input));
    }

    @Test
    public void isStrobogrammatic4() throws Exception {
        String input = "44";
        boolean expected = false;
        assertEquals(expected, solution.isStrobogrammatic(input));
    }
}