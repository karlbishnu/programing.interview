package net.bishnu.leetcode.findAndReplacePattern;

import java.util.*;

/**
 * 890. Find and Replace Pattern
 * https://leetcode.com/problems/find-and-replace-pattern/description/
 */
public class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new ArrayList<>(words.length);
        for(String word: words){
            if(matches(word, pattern)){
                ans.add(word);
            }
        }
        return ans;
    }

    private boolean matches(String word, String pattern) {
        if(word.length()<pattern.length())  return false;
        Map<Character, Character> map = new HashMap<>(pattern.length());
        Set<Character> chars = new HashSet<>(pattern.length());
        char[] w = word.toCharArray();
        char[] p = pattern.toCharArray();
        for(int i=0; i<p.length; i++){
            if(!map.containsKey(p[i]) && !chars.contains(w[i])){
                map.put(p[i], w[i]);
                chars.add(w[i]);
            }else if(!Character.valueOf(w[i]).equals(map.get(p[i]))){
                return false;
            }
        }

        return true;
    }
}
