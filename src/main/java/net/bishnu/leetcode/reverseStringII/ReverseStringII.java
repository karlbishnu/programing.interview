package net.bishnu.leetcode.reverseStringII;

/**
 * Created by karlb on 2017-03-16.
 */
public class ReverseStringII {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        StringBuilder reverse = new StringBuilder();
        while(i<s.length() && (i+(2*k))<s.length()){
            sb.append(reverse.append(s.substring(i, i+k)).reverse().toString())
                    .append(s.substring(i+k, i+(2*k)));
            reverse.setLength(0);
            i+=(2*k);
        }
        if(i<s.length()){
            int j= i+k<s.length() ? i+k : s.length();
            sb.append(reverse.append(s.substring(i,j)).reverse())
                    .append(s.substring(j));
        }
        return sb.toString();
    }
}
