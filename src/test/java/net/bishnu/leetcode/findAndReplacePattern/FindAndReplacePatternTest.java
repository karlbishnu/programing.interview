package net.bishnu.leetcode.findAndReplacePattern;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FindAndReplacePatternTest {

    @Test
    public void findAndReplacePattern() {
        String[] words = new String[]{"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        List<String> expected = Arrays.asList("mee", "aqq");
        Assert.assertEquals(expected, new FindAndReplacePattern().findAndReplacePattern(words, pattern));
    }
}