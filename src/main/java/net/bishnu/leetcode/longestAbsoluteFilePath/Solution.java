package net.bishnu.leetcode.longestAbsoluteFilePath;

import java.util.*;

/**
 * Created by karlb on 2017-03-05.
 */
public class Solution {
    public int lengthLongestPath(String input){
        String[] entities = input.split("\n");
        int maxPathLength = 0;
        Deque<Integer> stack = new LinkedList<>();

        stack.push(0);
        for(String entity: entities){
            int level = entity.lastIndexOf('\t')+1;
            while(level<stack.size()-1)   stack.pop();
            stack.push(stack.peek()+entity.length()-level+1);
            if(entity.contains(".")){
                maxPathLength = Math.max(maxPathLength, stack.peek()-1);
            }
        }
        return maxPathLength;
    }
}
