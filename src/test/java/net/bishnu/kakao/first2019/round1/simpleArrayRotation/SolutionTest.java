package net.bishnu.kakao.first2019.round1.simpleArrayRotation;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void getMaxElementIndexes1() {
        List<Integer> input = Arrays.asList(1,2,4,3);
        List<Integer> rotations = Arrays.asList(0,2);
        List<Integer> expected = Arrays.asList(2,0);
        assertEquals(expected, Solution.getMaxElementIndexes(input, rotations));
    }

    @Test
    public void getMaxElementIndexes2() {
        List<Integer> input = Arrays.asList(1,2,4,3);
        List<Integer> rotations = Arrays.asList(1,3);
        List<Integer> expected = Arrays.asList(1,3);
        assertEquals(expected, Solution.getMaxElementIndexes(input, rotations));
    }

    @Test
    public void getMaxElementIndexes3() {
        List<Integer> input = Arrays.asList(1,2,4,3,5);
        List<Integer> rotations = Arrays.asList(6,9,12);
        List<Integer> expected = Arrays.asList(3,0,2);
        assertEquals(expected, Solution.getMaxElementIndexes(input, rotations));
    }
}