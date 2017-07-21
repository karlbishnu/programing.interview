package net.bishnu.leetcode.climbingStairs;

/**
 * 70. Climbing Stairs
 * https://leetcode.com/problems/climbing-stairs/#/description
 */
public class ClimbingStairs {
    public static int climbStairs(int n){
        int[] ways = new int[n+1];
        for(int i=0; i<ways.length; i++){
            ways[i] = countWays(ways, i);
        }
        return ways[n];
    }

    private static int countWays(int[] ways, int i) {
        if(i < 0) return 0;
        else if(i==0) return 1;
        if(ways[i]!=0)  return ways[i];
        else    return countWays(ways, i-1) + countWays(ways, i-2);
    }
}
