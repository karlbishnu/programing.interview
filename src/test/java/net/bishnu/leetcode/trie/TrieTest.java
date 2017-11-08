package net.bishnu.leetcode.trie;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 208. Implement Trie (Prefix Tree)
 * https://leetcode.com/problems/implement-trie-prefix-tree/description/
 */
public class TrieTest {
    private Trie trie;

    @Before
    public void setUp(){
        trie = new Trie();
    }

    @Test
    public void insert() throws Exception {
        trie.insert("hi");
    }

    @Test
    public void search() throws Exception {
        String input = "hi";
        trie.insert(input);
        assertTrue(trie.search(input));
        assertFalse(trie.search("h"));
    }

    @Test
    public void search2() throws Exception {
        String[] inputs = new String[]{"hi","high"};
        for(String input: inputs){
            trie.insert(input);
        }

        assertTrue(trie.search(inputs[0]));
        assertTrue(trie.search(inputs[1]));
        assertFalse(trie.search("h"));
        assertFalse(trie.search("hight"));
    }

    @Test
    public void startWith() throws Exception {
        String input = "hi";
        trie.insert(input);
        assertTrue(trie.startsWith(input));
        assertTrue(trie.startsWith("h"));
        assertFalse(trie.startsWith("hig"));
    }

}