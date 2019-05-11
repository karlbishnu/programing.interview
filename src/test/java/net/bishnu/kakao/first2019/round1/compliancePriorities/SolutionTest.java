package net.bishnu.kakao.first2019.round1.compliancePriorities;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reassignedPriorities1() {
        List<Integer> priorities = Arrays.asList(1,3,7,3);
        List<Integer> expected = Arrays.asList(1,2,3,2);
        assertEquals(expected, Solution.reassignedPriorities(priorities));
    }

    @Test
    public void reassignedPriorities2() {
        List<Integer> priorities = Arrays.asList(2,9,3,2,3);
        List<Integer> expected = Arrays.asList(1,3,2,1,2);
        assertEquals(expected, Solution.reassignedPriorities(priorities));
    }

    @Test
    public void reassignedPriorities3() {
        List<Integer> priorities = Arrays.asList(18, 60, 92, 35, 5, 97, 65);
        List<Integer> expected = Arrays.asList(2,4,6,3,1,7,5);
        assertEquals(expected, Solution.reassignedPriorities(priorities));
    }

}