package net.bishnu.leetcode.strobogrammaticNumber;

import java.util.HashMap;
import java.util.Map;

/**
 * 246. Strobogrammatic Number
 * https://leetcode.com/problems/strobogrammatic-number/#/description
 * Created by karlb on 2017-04-23.
 */
public class StrobogrammaticNumber {
    private static final Map<Character, Character> pairs= new HashMap<>();

    static{
        pairs.put('0', '0');
        pairs.put('1', '1');
        pairs.put('6', '9');
        pairs.put('8', '8');
        pairs.put('9', '6');
    }
    public boolean isStrobogrammatic(String num) {
        char[] chars = num.toCharArray();
        for(int i=0,j=chars.length-1; i<=j; i++,j--){
            if(!pairs.containsKey(chars[i]) ||
                    chars[j] != pairs.get(chars[i])) return false;
        }
        return true;
    }
}
