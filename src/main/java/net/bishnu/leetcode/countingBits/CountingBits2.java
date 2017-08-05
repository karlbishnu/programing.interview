package net.bishnu.leetcode.countingBits;

/**
 * 338. Counting Bits
 * https://leetcode.com/problems/counting-bits/description/
 */
public class CountingBits2 {
    public static int[] countBit(int num){
        int[] arr = new int[num+1];
        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i&(i-1)] + 1;
        }
        return arr;
    }
}
