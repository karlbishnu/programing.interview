package net.bishnu.leetcode.outputContestMatches;

/**
 * 544. Output Contest Matches
 * https://leetcode.com/problems/output-contest-matches/#/description
 * Created by karlb on 2017-06-12.
 */
public class OutputContestMatches {
    public static String findContestMatch(int n) {
        int round = ((int) (Math.log10(n)/Math.log10(2)));
        String[] arr = new String[n*2-1];
        for(int i=0; i<n; i++){
            arr[i]=String.valueOf(i+1);
        }

        int index=n;
        for(int i=1; i<=round; i++){
            for(int s=index-(n>>(i-1)), w=index-1; s<w; s++, w--){
                arr[index++] = "(" + arr[s] + "," + arr[w] + ")";
            }
        }

        return arr[arr.length-1];
    }
}
