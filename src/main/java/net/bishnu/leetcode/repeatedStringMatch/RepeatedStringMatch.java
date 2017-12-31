package net.bishnu.leetcode.repeatedStringMatch;

/**
 * 686. Repeated String Match
 * https://leetcode.com/problems/repeated-string-match/description/
 */
public class RepeatedStringMatch {
    public int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder(A);
        int q = 1;
        for(;sb.length()<B.length(); q++)    sb.append(A);
        if(sb.indexOf(B)>=0)    return q;
        else if(sb.append(A).indexOf(B)>=0) return q+1;
        return -1;
    }
}
