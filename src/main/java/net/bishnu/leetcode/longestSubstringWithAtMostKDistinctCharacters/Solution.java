package net.bishnu.leetcode.longestSubstringWithAtMostKDistinctCharacters;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by karlb on 2017-03-11.
 */
public class Solution {
    class Container{
        Map<Character, Integer> counter = new HashMap<>();
        void add(Character aChar){
            if(!counter.containsKey(aChar))  counter.put(aChar, 1);
            else    counter.put(aChar, counter.get(aChar)+1);
        }

        int size(){
            return counter.size();
        }

        void remove(Character aChar){
            int count = counter.get(aChar)-1;
            if(count<=0) counter.remove(aChar);
            else    counter.put(aChar, count);
        }
    }

    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Container set = new Container();
        int result = 0;
        for(int pivot=0, runner=0; runner<s.length(); runner++){
            set.add(s.charAt(runner));
            while (k<set.size() && runner>= pivot){
                set.remove(s.charAt(pivot++));
            }
            int length = runner-pivot+1;
            result = result>length ? result : length;
        }
        return result;
    }
}
