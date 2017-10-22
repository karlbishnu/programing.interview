package net.bishnu.leetcode.regularExpressionMatching;

/**
 * 10. Regular Expression Matching
 * https://leetcode.com/problems/regular-expression-matching/description/
 */
public class RegularExpressionMatching {
    private enum Result{TRUE, FALSE}
    public static boolean isMatch(String s, String p){
        Result[][] stats = new Result[s.length()+1][p.length()+1];
        return dp(0, 0, s, p, stats);
    }

    private static boolean dp(int i, int j, String s, String p, Result[][] stats) {
        if(stats[i][j] != null) return stats[i][j]==Result.TRUE;
        boolean ans;
        if(j>=p.length()){
            ans = i==s.length();
        }else{
            boolean firstMatch = i<s.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.');

            if(j+1<p.length() && p.charAt(j+1)=='*'){
                ans = dp(i, j+2, s, p, stats) ||
                        (firstMatch && dp(i+1, j, s, p, stats));
            }else{
                ans = firstMatch && dp(i+1, j+1, s, p, stats);
            }
        }
        stats[i][j] = ans ? Result.TRUE : Result.FALSE;
        return ans;
    }
}
