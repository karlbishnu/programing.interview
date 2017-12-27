package net.bishnu.leetcode.asteroidCollision;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 735. Asteroid Collision
 * https://leetcode.com/problems/asteroid-collision/description/
 */
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new LinkedList<>();
        for(int e: asteroids){
            if(e<0){
                int size = Math.abs(e), top;
                while(size!=0 && !stack.isEmpty() && (top=stack.peek())>0){
                    if(size>top)    stack.pop();
                    else if(size<top)   size=0;
                    else{
                        stack.pop();
                        size=0;
                    }
                }
                if(size!=0) stack.push(e);
            }else {
                stack.push(e);
            }
        }

        int[] res = new int[stack.size()];
        for(int i=0; i<res.length; i++)  {
            res[i] = stack.removeLast();
        }
        return res;
    }
}
