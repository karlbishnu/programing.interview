package net.bishnu.leetcode.contiguousArray;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by karlb on 2017-02-25.
 */
public class Solution {
    public int findMaxLength(int[] nums){
        if(nums.length < 2) return 0;

        Map<Integer, Integer> startIndexMap = new HashMap<>();
        startIndexMap.put(0, -1);

        int result=0, tmp=0;
        for(int i=0; i<nums.length; i++){
            tmp = nums[i]==0 ? tmp-1 : tmp+1;
            if(startIndexMap.containsKey(tmp)){
                int distance = i-startIndexMap.get(tmp);
                result = result>distance ? result : distance;
            }else{
                startIndexMap.put(tmp, i);
            }
        }
        return result==0 && startIndexMap.keySet().size()!=nums.length+1?
                nums.length%2==0 ? nums.length : nums.length-1
                : result;
    }
}
