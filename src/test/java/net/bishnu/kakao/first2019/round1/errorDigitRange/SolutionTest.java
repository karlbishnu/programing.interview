package net.bishnu.kakao.first2019.round1.errorDigitRange;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findRange() {
        int input = 1;
        long expected = 8;
        assertEquals(expected, Solution.findRange(input));
    }

    @Test
    public void findRange2() {
        int input = 909;
        long expected = 898;
        assertEquals(expected, Solution.findRange(input));
    }

    @Test
    public void findRange3() {
        int input = 123512;
        long expected = 820082;
        assertEquals(expected, Solution.findRange(input));
    }

    @Test
    public void findRange4() {
        int input = 17654;
        long expected = 87000;
        assertEquals(expected, Solution.findRange(input));
    }
}