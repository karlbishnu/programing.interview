package net.bishnu.leetcode.uniqueWordAbbreviation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 288. Unique Word Abbreviation
 * https://leetcode.com/problems/unique-word-abbreviation/#/description
 * Created by karlb on 2017-05-01.
 */
public class ValidWordAbbr {
    private Map<String, Set<String>> abbrs = new HashMap<>();
    private String makeAbbr(String input){
        return input.length()<3 ? input : String.format("%c%d%c", input.charAt(0), (input.length()-2), input.charAt(input.length()-1));
    }

    public ValidWordAbbr(String[] dictionary){
        for(String word: dictionary){
            String abbr = makeAbbr(word);
            Set<String> words = abbrs.containsKey(abbr) ?
                    abbrs.get(abbr) : new HashSet<>();

            words.add(word);
            abbrs.put(abbr, words);
        }
    }

    public boolean isUnique(String word){
        Set<String> words = abbrs.get(makeAbbr(word));
        return words==null || (words.size()==1 && words.contains(word));
    }
}
