package net.bishnu.leetcode.reverseString;

/**
 * 344. Reverse String
 * https://leetcode.com/problems/reverse-string/description/
 */
public class ReverseString {
    public static String reverseString(String s){
        char[] arr = s.toCharArray();
        int i=0, j=s.length()-1;
        while(i<j){
            char tmp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = tmp;
        }

        return new String(arr);
    }
}
