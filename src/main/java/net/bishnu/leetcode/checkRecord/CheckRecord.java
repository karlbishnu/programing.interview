package net.bishnu.leetcode.checkRecord;

/**
 * 551. Student Attendance Record I
 * https://leetcode.com/problems/student-attendance-record-i/#/description
 * Created by karlb on 2017-04-21.
 */
public class CheckRecord {
    public boolean checkRecord(String s){
        int A = 2, L = 3;
        for(char c: s.toCharArray()){
            if(c == 'L'){
                L--;
            }else{
                if(c=='A')  A--;
                L=3;
            }
            if(A==0 || L==0)    return false;
        }
        return true;
        /*return !(s.codePoints().filter(ch->ch=='A').count() > 1 ||
                s.contains("LLL"));*/
    }
}
