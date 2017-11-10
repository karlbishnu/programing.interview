package net.bishnu.leetcode.zigZagConversion;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 6. ZigZag Conversion
 * https://leetcode.com/problems/zigzag-conversion/description/
 */
public class ZigZagConversionTest {
    private ZigZagConversion zigZagConversion = new ZigZagConversion();

    @Test
    public void convert1() throws Exception {
        String input = "";
        int numRows = 1;
        String expected = "";

        assertEquals(expected, zigZagConversion.convert(input, numRows));

    }

    @Test
    public void convert2() throws Exception {
        String input = "PAYPALISHIRING";
        int numRows = 1;
        String expected = "PAYPALISHIRING";

        assertEquals(expected, zigZagConversion.convert(input, numRows));

    }

    @Test
    public void convert3() throws Exception {
        String input = "PAYPALISHIRING";
        int numRows = 2;
        String expected = "PYAIHRNAPLSIIG";

        assertEquals(expected, zigZagConversion.convert(input, numRows));

    }

    @Test
    public void convert4() throws Exception {
        String input = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";

        assertEquals(expected, zigZagConversion.convert(input, numRows));

    }

    @Test
    public void convert5() throws Exception {
        String input = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";

        assertEquals(expected, zigZagConversion.convert(input, numRows));

    }

    @Test
    public void convert6() throws Exception {
        String input = "PAYPALISHIRING";
        int numRows = 5;
        String expected = "PHASIYIRPLIGAN";

        assertEquals(expected, zigZagConversion.convert(input, numRows));

    }

}