package net.bishnu.leetcode.evaluateDivisions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 399. Evaluate Division
 * https://leetcode.com/problems/evaluate-division/description/
 */
public class EvaluateDivisionTest {
    EvaluateDivision evaluateDivision = new EvaluateDivision();

    @Test
    public void clacEquations1() {
        String[][] equations = new String[][]{{"a","b"}, {"b","c"}};
        double[] values = new double[]{2.0, 3.0};
        String[][] queries = new String[][]{{"a","c"},{"b","c"},{"a","e"},{"a","a"},{"x","x"}};
        double[] expected= new double[]{6.00000,3.00000,-1.00000,1.00000,-1.00000};

        assertArrayEquals(expected, evaluateDivision.clacEquations(equations, values, queries), 0);
    }

    @Test
    public void clacEquations2() {
        String[][] equations = new String[][]{{"a","b"}, {"c","d"}};
        double[] values = new double[]{1.0, 1.0};
        String[][] queries = new String[][]{{"a","c"},{"b","d"},{"b","a"},{"d","c"}};
        double[] expected= new double[]{-1.00000,-1.00000,1.00000,1.00000};

        assertArrayEquals(expected, evaluateDivision.clacEquations(equations, values, queries), 0);
    }
}