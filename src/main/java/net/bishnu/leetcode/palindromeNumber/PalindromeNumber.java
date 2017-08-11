package net.bishnu.leetcode.palindromeNumber;

/**
 * 9. Palindrome Number
 * https://leetcode.com/problems/palindrome-number/description/
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int tmp=x;
        int rev = 0;
        while(tmp>0){
            rev = rev*10+tmp%10;
            tmp/=10;
        }
        return rev==x;
    }
}
