package net.bishnu.leetcode.encodeAndDecodeStrings;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-04-25.
 */
public class CodecTest {
    Codec solution = new Codec();

    @Test
    public void encode() throws Exception {
        String expected = "te\\\\st|test\\-|";
        List<String> input = new ArrayList<>(2);
        input.add("te\\st");
        input.add("test|");
        assertEquals(expected, solution.encode(input));
        assertEquals(input, solution.decode(solution.encode(input)));
    }

    @Test
    public void decode() throws Exception {
        String input = "te\\\\st|test\\-|";
        List<String> expected = new ArrayList<>(2);
        expected.add("te\\st");
        expected.add("test|");
        assertEquals(expected, solution.decode(input));
    }

    @Test
    public void encode2() throws Exception {
        String expected = "";
        List<String> input = new ArrayList<>();
        assertEquals(expected, solution.encode(input));
        assertEquals(input, solution.decode(solution.encode(input)));
    }

    @Test
    public void decode2() throws Exception {
        String input = "";
        List<String> expected = new ArrayList<>();
        assertEquals(expected, solution.decode(input));
    }

    @Test
    public void encode3() throws Exception {
        String expected = "|";
        List<String> input = new ArrayList<>();
        input.add("");
        assertEquals(expected, solution.encode(input));
        assertEquals(input, solution.decode(solution.encode(input)));
    }

    @Test
    public void encode4() throws Exception {
        int size = 100;
        StringBuilder expected = new StringBuilder();
        String one = "|";
        List<String> input = new ArrayList<>();
        for(int i=0; i<size; i++){
            input.add("");
            expected.append(one);
        }

        assertEquals(expected.toString(), solution.encode(input));
        assertEquals(input, solution.decode(solution.encode(input)));
    }

    @Test
    public void encode5() throws Exception {
        String expected = "i||";
        List<String> input = new ArrayList<>();
        input.add("i");
        input.add("");
        assertEquals(expected, solution.encode(input));
        assertEquals(input, solution.decode(solution.encode(input)));
    }
}