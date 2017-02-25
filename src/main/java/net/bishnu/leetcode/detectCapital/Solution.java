package net.bishnu.leetcode.detectCapital;

/**
 * Created by karlb on 2017-02-25.
 */
public class Solution {
    public boolean detectCapitalUse(String word) {
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1).toLowerCase());
        int camelHash = sb.toString().hashCode();
        int hash = word.hashCode();
        return camelHash == hash ||
                word.toUpperCase().hashCode() == hash ||
                word.toLowerCase().hashCode() == hash;
    }
}
