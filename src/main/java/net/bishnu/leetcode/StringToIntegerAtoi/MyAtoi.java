package net.bishnu.leetcode.StringToIntegerAtoi;

/**
 * 8. String to Integer (atoi)
 * https://leetcode.com/problems/string-to-integer-atoi/description/
 */
public class MyAtoi {
    public static int myAtoi(String str){
        if(str==null || str.isEmpty())  return 0;
        long res = 0;

        char[] arr = str.trim().toCharArray();
        boolean sign=arr[0] == '+' || arr[0]=='-';
        boolean negative = sign&&arr[0]=='-';
        for (int i=sign?1:0; i<arr.length && res<=Integer.MAX_VALUE; i++){
            char c=arr[i];
            if(c<'0' || c>'9')  break;
            res=res*10 + c-'0';
        }

        return res>Integer.MAX_VALUE ?
                (negative ? Integer.MIN_VALUE : Integer.MAX_VALUE) :
                (negative ? (int) res * (-1) : (int) res);
    }
}
