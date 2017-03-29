package net.bishnu.leetcode.decodeString;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 394. Decode String
 * https://leetcode.com/problems/decode-string/#/description
 * Created by karlb on 2017-03-29.
 */
public class DecodeString {
    public String decodeString(String s) {
        Deque<StringBuilder> stack = new LinkedList<>();
        stack.push(new StringBuilder());

        boolean prevNumber = false;
        for(int i=0; i<s.length(); i++){
            char aChar = s.charAt(i);
            if(aChar=='['){
                stack.push(new StringBuilder());
                prevNumber=false;
            }else if(aChar==']'){
                String substring = stack.poll().toString();
                int count = Integer.parseInt(stack.poll().toString());
                StringBuilder sb = stack.peek();
                for(int j=0; j<count; j++){
                    sb.append(substring);
                }
            }else if(aChar>='0' && aChar<='9'){
                if(prevNumber){
                    stack.peek().append(aChar);
                }else{
                    stack.push(new StringBuilder().append(aChar));
                    prevNumber = true;
                }
            } else{
                stack.peek().append(aChar);
            }
        }

        return stack.poll().toString();
    }
}
