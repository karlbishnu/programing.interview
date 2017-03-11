package net.bishnu.leetcode.licenseKeyFormatting;

/**
 * Created by karlb on 2017-03-11.
 */
public class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder sb = new StringBuilder();
        for(String s: S.split("-")){
            sb.append(s.toUpperCase());
        }
        int remaining = sb.length();
        while(remaining>K){
            remaining-=K;
            sb.insert(remaining, '-');
        }
        return sb.toString();
    }
}
