package net.bishnu.leetcode.sentenceSimilarityII;

import java.util.*;

/**
 * 737. Sentence Similarity II
 * https://leetcode.com/problems/sentence-similarity-ii/description/
 */
public class SentenceSimilarityII {
    public boolean areSentencesSimilarTwo(String[] words1, String[] words2, String[][] pairs) {
        if(words1.length != words2.length)  return false;
        Map<String, Set<String>> dict = makeDict(pairs);

        for(int i=0; i<words1.length; i++) {
            Set<String> seen = new HashSet<>();
            if(!dfs(words1[i], words2[i], seen, dict))   return false;
        }
        return true;
    }

    private boolean dfs(String word, String target, Set<String> seen, Map<String, Set<String>> dict){
        Deque<String> stack = new LinkedList<>();
        stack.push(word);
        while (!stack.isEmpty()) {
            String visit = stack.pop();
            if (visit.equals(target)) return true;
            else {
                seen.add(visit);
                Set<String> nexts = dict.getOrDefault(visit, new HashSet<>());
                for (String next : nexts) {
                    if (!seen.contains(next)) stack.push(next);
                }
            }
        }
        return false;
    }

    private Map<String, Set<String>> makeDict(String[][] pairs){
        Map<String, Set<String>> dict = new HashMap<>();
        if(pairs == null || pairs.length==0)  return dict;
        for(String[] pair: pairs){
            Set<String> set = dict.getOrDefault(pair[0], new HashSet<>());
            Set<String> set2 = dict.getOrDefault(pair[1], new HashSet<>());
            if(set!=set2){
                set.addAll(set2);
            }
            set.add(pair[0]);
            set.add(pair[1]);
            dict.put(pair[0], set);
            dict.put(pair[1], set);
        }
        return dict;
    }
}
