package net.bishnu.leetcode.palindromeNumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {
    @Test
    public void isPalindrome() throws Exception {
        int input =1;
        boolean expected = true;
        assertEquals(expected, PalindromeNumber.isPalindrome(input));
    }

    @Test
    public void isPalindrome2() throws Exception {
        int input =11;
        boolean expected = true;
        assertEquals(expected, PalindromeNumber.isPalindrome(input));
    }

    @Test
    public void isPalindrome3() throws Exception {
        int input =12;
        boolean expected = false;
        assertEquals(expected, PalindromeNumber.isPalindrome(input));
    }

    @Test
    public void isPalindrome4() throws Exception {
        int input =-1;
        boolean expected = false;
        assertEquals(expected, PalindromeNumber.isPalindrome(input));
    }

}