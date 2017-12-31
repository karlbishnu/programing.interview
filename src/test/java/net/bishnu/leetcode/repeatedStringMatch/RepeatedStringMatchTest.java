package net.bishnu.leetcode.repeatedStringMatch;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 686. Repeated String Match
 * https://leetcode.com/problems/repeated-string-match/description/
 */
public class RepeatedStringMatchTest {
    RepeatedStringMatch repeatedStringMatch = new RepeatedStringMatch();

    @Test
    public void repeatedStringMatch1() {
        String A = "abcd";
        String B = "cdabcdab";
        int expected = 3;

        assertEquals(expected, repeatedStringMatch.repeatedStringMatch(A, B));
    }
}