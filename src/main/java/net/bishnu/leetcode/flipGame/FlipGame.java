package net.bishnu.leetcode.flipGame;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 293. Flip Game
 * https://leetcode.com/problems/flip-game/#/description
 * Created by karlb on 2017-06-15.
 */
public class FlipGame {
    public List<String> generatePossibleNextMoves(String s) {
        char[] src = s.toCharArray();
        List<String> result = new LinkedList<>();
        for(int prev=0, curr =1; curr<s.length(); prev++, curr++){
            if(src[prev]=='+' && '+'==src[curr])    result.add(flip(src, prev, curr));
        }
        return result;
    }

    private String flip(char[] src, int prev, int curr) {
        src[prev]=src[curr]= '-';
        String result = String.valueOf(src);
        src[prev]=src[curr]= '+';
        return result;
    }
}
