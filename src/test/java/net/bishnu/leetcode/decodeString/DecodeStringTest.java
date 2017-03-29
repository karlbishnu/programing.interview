package net.bishnu.leetcode.decodeString;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-03-29.
 */
public class DecodeStringTest {
    @Test
    public void test(){
        StringBuilder sb = new StringBuilder("12345");
        Assert.assertEquals("612345", sb.insert(0, "6").toString());
    }
    @Test
    public void decodeString1() throws Exception {
        String input = "3[a]2[bc]";
        String expected = "aaabcbc";

        DecodeString solution = new DecodeString();
        Assert.assertEquals(expected, solution.decodeString(input));
    }

    @Test
    public void decodeString2() throws Exception {
        String input = "3[a2[c]]";
        String expected = "accaccacc";

        DecodeString solution = new DecodeString();
        Assert.assertEquals(expected, solution.decodeString(input));
    }

    @Test
    public void decodeString3() throws Exception {
        String input = "2[abc]3[cd]ef";
        String expected = "abcabccdcdcdef";

        DecodeString solution = new DecodeString();
        Assert.assertEquals(expected, solution.decodeString(input));
    }
}