package net.bishnu.leetcode.reverseVowels;

import java.util.HashSet;
import java.util.Set;

/**
 * 345. Reverse Vowels of a String
 * https://leetcode.com/problems/reverse-vowels-of-a-string/#/description
 * Created by karlb on 2017-04-23.
 */
public class ReverseVowels {
    private static final Set<Character> vowels = new HashSet<>();
    static{
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
    }

    public String reverseVowels(String s){
        char[] chars = s.toCharArray();
        for(int i=0, j=chars.length-1; i<j; i++){
            if(vowels.contains(chars[i])){
                while(j>i && !vowels.contains(chars[j]))    j--;
                if(j!=i)    swap(chars, i, j--);
            }
        }
        return String.valueOf(chars);
    }

    private void swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }
}
