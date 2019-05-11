package net.bishnu.kakao.first2019.round1.errorDigitRange;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static long findRange(int num) {
        // Write your code here
        Digits digits = new Digits(num);
        return digits.max()-digits.min();
    }

    private static class Digits{
        private List<Integer> digits;
        Digits(int num){
            LinkedList<Integer> digits = new LinkedList<>();
            while (num != 0) {
                int digit = num % 10;
                digits.addFirst(digit);
                num/=10;
            }
            this.digits = digits;
        }

        public long max(){
            int misinterpreted = getMisinterpreted(9);
            return buildNum(misinterpreted, 9);
        }

        private int getMisinterpreted(int n){
            for(Integer digit: digits){
                if(n!=digit)    return digit;
            }
            return n;
        }

        private long buildNum(int misinterpreted, int to){
            long num = 0;
            for(Integer digit: digits){
                digit = misinterpreted==digit ? to : digit;
                num = num*10 + digit;
            }
            return num;
        }

        public long min(){
            int misinterpreted = getMisinterpreted(1);
            int to = misinterpreted==digits.get(0) ? 1 : 0;
            return buildNum(misinterpreted, to);
        }
    }
}
