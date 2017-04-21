package net.bishnu.leetcode.optimalDivision;

/**
 * 553. Optimal Division
 * https://leetcode.com/problems/optimal-division/#/description
 * Created by karlb on 2017-04-21.
 */
public class OptimalDivision {
    public static String optimalDivision(int[] nums){
        if(nums.length==1)  return String.valueOf(nums[0]);
        if(nums.length==2)  return nums[0]+"/"+nums[1];

        StringBuilder sb = new StringBuilder();
        sb.append(nums[0]).append("/(");
        for(int i=1; i<nums.length; i++){
            sb.append(nums[i]).append("/");
        }
        sb.setLength(sb.length()-1);
        sb.append(")");
        return sb.toString();
    }
}
