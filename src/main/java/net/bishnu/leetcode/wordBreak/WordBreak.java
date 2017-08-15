package net.bishnu.leetcode.wordBreak;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 139. Word Break
 * https://leetcode.com/problems/word-break/description/
 */
public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] a = new boolean[s.length()+1];
        a[0] = true;
        Set<String> dict = new HashSet<>(wordDict);
        for(int i=1; i<=s.length(); i++){
            for(int j=0; j<i; j++){
                if(a[j] && dict.contains(s.substring(j, i))){
                    a[i] = true;
                    break;
                }
            }
        }
        return a[s.length()];
    }
}
