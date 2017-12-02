package net.bishnu.leetcode.selfDividingNumbers;

import java.util.LinkedList;
import java.util.List;

/**
 * 728. Self Dividing Numbers
 * https://leetcode.com/problems/self-dividing-numbers/description/
 */
public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new LinkedList<>();
        for(int i=left; i<=right; i++){
            if(isSelfDividing(i))   ans.add(i);
        }
        return ans;
    }

    private boolean isSelfDividing(int i) {
        int cur = i;
        while(cur!=0){
            int digit = cur%10;
            if(digit==0 || i%digit!=0)  return false;
            cur /= 10;
        }
        return true;
    }
}
