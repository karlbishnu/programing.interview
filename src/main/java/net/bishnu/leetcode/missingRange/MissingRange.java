package net.bishnu.leetcode.missingRange;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 163. Missing Ranges
 * https://leetcode.com/problems/missing-ranges/#/description
 * Created by karlb on 2017-04-17.
 */
public class MissingRange {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        int lowPosition = Arrays.binarySearch(nums, lower);
        int upperPosition = Arrays.binarySearch(nums, upper);

        int lowIndex = lowPosition >= 0 ? lowPosition : -lowPosition - 1;
        int upIndex = upperPosition >= 0 ? upperPosition : -upperPosition - 1 == nums.length ? nums.length-1 : -upperPosition - 2 ;

        List<String> result = new LinkedList<>();

        long floor = lower;
        for(int i=lowIndex; i<=upIndex; i++){
            long ceil = (long) nums[i]-1;
            if(floor < ceil){
                result.add(floor+"->"+ceil);
            }else if(floor == ceil){
                result.add(String.valueOf(floor));
            }
            floor = nums[i]+1;
        }

        if(upperPosition < 0){
            if(floor < upper){
                result.add(floor+"->"+upper);
            }else if(floor == upper){
                result.add(String.valueOf(floor));
            }
        }

        return result;
    }
}
