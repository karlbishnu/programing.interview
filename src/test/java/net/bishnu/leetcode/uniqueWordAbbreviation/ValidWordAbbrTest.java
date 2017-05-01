package net.bishnu.leetcode.uniqueWordAbbreviation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 288. Unique Word Abbreviation
 * https://leetcode.com/problems/unique-word-abbreviation/#/description
 * Created by karlb on 2017-05-01.
 */
public class ValidWordAbbrTest {
    @Test
    public void isUnique() throws Exception {
        String[] dictionary = new String[]{"deer", "door", "cake", "card"};
        ValidWordAbbr validWordAbbr = new ValidWordAbbr(dictionary);

        assertFalse(validWordAbbr.isUnique("dear"));
        assertTrue(validWordAbbr.isUnique("cart"));
        assertFalse(validWordAbbr.isUnique("cane"));
        assertTrue(validWordAbbr.isUnique("make"));
    }

    @Test
    public void isUnique2() throws Exception {
        String[] dictionary = new String[]{"hello"};
        ValidWordAbbr validWordAbbr = new ValidWordAbbr(dictionary);

        assertTrue(validWordAbbr.isUnique("hello"));
    }

}