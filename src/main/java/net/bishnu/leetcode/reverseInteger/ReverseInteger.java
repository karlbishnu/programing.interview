package net.bishnu.leetcode.reverseInteger;

/**
 * 7. Reverse Integer
 * https://leetcode.com/problems/reverse-integer/description/
 */
public class ReverseInteger {
    public static int reverse(int x){
        int tmp = x;
        long result = 0;
        while(tmp != 0){
            result = result*10 + tmp%10;
            tmp/=10;
        }
        return result>Integer.MAX_VALUE || result<Integer.MIN_VALUE ? 0 : (int) result;
    }
}
