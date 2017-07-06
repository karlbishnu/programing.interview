package net.bishnu.leetcode.squareSum;

/**
 * Created by karlb on 2017-07-06.
 */
public class SquareSum {
    public static boolean judgeSquareSum(int c){
        int sqrt = (int) Math.sqrt(c);
        for(int i=0; i<=sqrt; i++){
            int bSq = c-i*i;
            int b = (int) Math.sqrt(bSq);
            if(bSq==b*b)    return true;
        }
        return false;
    }
}
