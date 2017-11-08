package net.bishnu.leetcode.longestWordInDictionary;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 720. Longest Word in Dictionary
 * https://leetcode.com/problems/longest-word-in-dictionary/description/
 */
public class LongestWordInDictionaryTest {
    LongestWordInDictionary longestWordInDictionary;

    @Before
    public void setUp(){
        longestWordInDictionary = new LongestWordInDictionary();
    }

    @Test
    public void longestWord1() throws Exception {
        String[] words = new String[]{"w","wo","wor","worl", "world"};

        assertEquals("world", longestWordInDictionary.longestWord(words));
    }

    @Test
    public void longestWord2() throws Exception {
        String[] words = new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"};

        assertEquals("apple", longestWordInDictionary.longestWord(words));
    }
}