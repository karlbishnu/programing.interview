package net.bishnu.leetcode.findMaxConsecutiveOnes;

/**
 * Created by karlb on 2017-02-05.
 * 485. Max Consecutive Ones
 */
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int result = 0;
        int buf = 0;
        for(int binary: nums){
            buf = binary==0 ? 0 : buf+binary;
            result = buf>result ? buf : result;
        }
        return result;
    }
}
