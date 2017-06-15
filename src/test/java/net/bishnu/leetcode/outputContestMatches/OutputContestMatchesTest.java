package net.bishnu.leetcode.outputContestMatches;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-06-12.
 */
public class OutputContestMatchesTest {
    @Test
    public void findContestMatchCase1() throws Exception {
        int input = 2;
        String expected = "(1,2)";
        assertEquals(expected, OutputContestMatches.findContestMatch(input));
    }

    @Test
    public void findContestMatchCase2() throws Exception {
        int input = 4;
        String expected = "((1,4),(2,3))";
        assertEquals(expected, OutputContestMatches.findContestMatch(input));
    }

    @Test
    public void findContestMatchCase3() throws Exception {
        int input = 8;
        String expected = "(((1,8),(4,5)),((2,7),(3,6)))";
        assertEquals(expected, OutputContestMatches.findContestMatch(input));
    }
}