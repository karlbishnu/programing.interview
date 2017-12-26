package net.bishnu.leetcode.monotoneIncreasingDigits;

/**
 * 738. Monotone Increasing Digits
 * https://leetcode.com/problems/monotone-increasing-digits/hints/
 */
public class MonotoneIncreasingDigits {
    public int monotoneIncreasingDigits(int N){
        char[] num = String.valueOf(N).toCharArray();
        char org='0'-1;
        for(int i=1; i<num.length; i++){
            if(num[i-1]>num[i]){
                org = num[i-1];
                break;
            }
        }

        boolean nine=false;
        for(int i=0; i<num.length; i++){
            if(!nine && num[i]==org){
                nine=true;
                num[i]--;
            }else if(nine){
                num[i]='9';
            }
        }
        return Integer.parseInt(String.valueOf(num));
    }
}
