package net.bishnu.leetcode.trappingRainWater;


import java.util.Deque;
import java.util.LinkedList;

/**
 * 42. Trapping Rain Water
 * https://leetcode.com/problems/trapping-rain-water/description/
 */
public class TrappingRainWater {

    public int trap(int[] height){
        if(height==null || height.length<3) return 0;
        Deque<Integer> stack = new LinkedList<>();
        int res=0;

        for(int p=0, curr=1; curr<height.length; p++,curr++){
            if(height[p] > height[curr]){
                stack.push(p);
            }else if(height[p] < height[curr]){
                if(stack.isEmpty()) continue;
                else{
                    int left = 0;
                    while(!stack.isEmpty() && height[left=stack.peek()] <= height[curr]){
                        stack.pop();
                    }
                    int min = Math.min(height[left], height[curr]);
                    for(int i=left+1; i<curr; i++){
                        res+=min-height[i];
                        height[i]=min;
                    }
                }
            }
        }
        return res;
    }
}
