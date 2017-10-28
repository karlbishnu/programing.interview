package net.bishnu.leetcode.romanTointeger;

import java.util.HashMap;
import java.util.Map;

/**
 * 13.Roman To Integer
 * https://leetcode.com/problems/roman-to-integer/description/
 */
public class RomanToInteger{
    private static Map<Character, Integer> map = new HashMap<>();
    static{
        map.put('I', 1);    map.put('V', 5);    map.put('X', 10);    map.put('L', 50);
        map.put('C', 100);    map.put('D', 500);    map.put('M', 1000);

    }

    public static int romanToInt(String s){
        char[] roman = s.toUpperCase().toCharArray();
        if(roman.length == 0 )  return 0;
        int pre = map.get(roman[0]);
        int res = pre;

        for(int i=1; i<roman.length; i++){
            Integer curr = map.get(roman[i]);
            if(curr==null){
                pre = Integer.MAX_VALUE;
                continue;
            }
            res += pre<curr ? curr-pre-pre : curr;
            pre = curr;
        }
        return  res;
    }
}
