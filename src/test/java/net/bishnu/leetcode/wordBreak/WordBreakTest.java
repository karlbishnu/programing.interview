package net.bishnu.leetcode.wordBreak;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class WordBreakTest {
    @Test
    public void wordBreak() throws Exception {
        String s = "leetcode";
        List<String> wordDict = new LinkedList<>();
        wordDict.add("leet");
        wordDict.add("code");

        boolean expected = true;
        assertEquals(expected, WordBreak.wordBreak(s, wordDict));
    }

    @Test
    public void wordBreak2() throws Exception {
        String s = "leetcod";
        List<String> wordDict = new LinkedList<>();
        wordDict.add("leet");
        wordDict.add("code");

        boolean expected = false;
        assertEquals(expected, WordBreak.wordBreak(s, wordDict));
    }

    @Test
    public void wordBreak3() throws Exception {
        String s = "aaaabbbaaaaaaa";
        List<String> wordDict = new LinkedList<>();
        wordDict.add("aaa");
        wordDict.add("aaaa");
        wordDict.add("bbb");
        wordDict.add("abb");

        boolean expected = true;
        assertEquals(expected, WordBreak.wordBreak(s, wordDict));
    }

}