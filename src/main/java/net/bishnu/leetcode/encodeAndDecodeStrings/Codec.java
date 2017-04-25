package net.bishnu.leetcode.encodeAndDecodeStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 271. Encode and Decode Strings
 * https://leetcode.com/problems/encode-and-decode-strings/#/description
 * Created by karlb on 2017-04-25.
 */
public class Codec {
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        if(strs.size()==0)  return "";
        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            sb.append(str.replaceAll("\\\\", "\\\\\\\\").replaceAll("\\|", "\\\\-"))
                    .append('|');
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> list = new LinkedList<>();
        int prev = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '|'){
                list.add(""+s.substring(prev, i));
                prev = i+1;
            }
        }

        for(int i=0; i<list.size(); i++){
            list.set(i, list.get(i).replaceAll("\\\\-", "\\|").replaceAll("\\\\\\\\", "\\\\"));
        }

        return list;
    }
}
