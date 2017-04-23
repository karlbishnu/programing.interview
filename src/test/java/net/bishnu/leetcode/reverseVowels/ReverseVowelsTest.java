package net.bishnu.leetcode.reverseVowels;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 345. Reverse Vowels of a String
 * https://leetcode.com/problems/reverse-vowels-of-a-string/#/description
 * Created by karlb on 2017-04-23.
 */
public class ReverseVowelsTest {
    ReverseVowels solution = new ReverseVowels();
    @Test
    public void reverseVowels() throws Exception {
        String input = "hello";
        String expected = "holle";
        assertEquals(expected, solution.reverseVowels(input));
    }

    @Test
    public void reverseVowels2() throws Exception {
        String input = "leetcode";
        String expected = "leotcede";
        assertEquals(expected, solution.reverseVowels(input));
    }

}