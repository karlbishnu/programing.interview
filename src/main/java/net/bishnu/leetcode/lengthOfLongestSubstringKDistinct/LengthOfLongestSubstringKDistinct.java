package net.bishnu.leetcode.lengthOfLongestSubstringKDistinct;

import java.util.HashMap;
import java.util.Map;

/**
 * 340. Longest Substring with At Most K Distinct Characters
 * https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/description/
 */
public class LengthOfLongestSubstringKDistinct {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(s==null || k==0) return 0;
        Map<Character, Integer> lastIdx = new HashMap<>();
        int ans=0;
        for(int p=0, f=0; f<s.length(); f++){
            if(lastIdx.size()==k && !lastIdx.containsKey(s.charAt(f))){
                char removable = getLru(lastIdx);
                p = lastIdx.get(removable)+1;
                lastIdx.remove(removable);
            }
            lastIdx.put(s.charAt(f), f);
            ans=Math.max(ans, f-p+1);
        }

        return ans;
    }

    private char getLru(Map<Character, Integer> lastIdx){
        Map.Entry<Character, Integer> res = null;
        for(Map.Entry<Character, Integer> e: lastIdx.entrySet()){
            if(res==null) res=e;
            else res = res.getValue()>e.getValue() ? e : res;
        }
        return res==null ? ' ' : res.getKey();
    }
}
