package net.bishnu.leetcode.plusOne;

/**
 * Created by karlb on 2017-03-06.
 */
public class Solution {
    public int[] plusOne(int[] digits){
        int i=digits.length-1;
        int carry = 1;
        while(i>-1 && (digits[i]==9 || carry > 0)){
            digits[i] += carry;
            carry = digits[i]>9 ? 1 : 0;
            digits[i--] %= 10;
        }

        if(i==-1 && carry==1){
            digits = new int[digits.length+1];
            digits[0] = 1;
        }
        return digits;
    }
}
