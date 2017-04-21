package net.bishnu.leetcode.checkRecord;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 551. Student Attendance Record I
 * https://leetcode.com/problems/student-attendance-record-i/#/description
 * Created by karlb on 2017-04-21.
 */
public class CheckRecordTest {
    @Test
    public void checkRecord() throws Exception {
        CheckRecord checkRecord = new CheckRecord();
        String input = "PPALLP";
        boolean expected = true;
        assertEquals(expected, checkRecord.checkRecord(input));
    }

    @Test
    public void checkRecord2() throws Exception {
        CheckRecord checkRecord = new CheckRecord();
        String input = "PPALLL";
        boolean expected = false;
        assertEquals(expected, checkRecord.checkRecord(input));
    }

    @Test
    public void checkRecord3() throws Exception{
        CheckRecord checkRecord = new CheckRecord();
        String input = "AA";
        boolean expected = false;
        assertEquals(expected, checkRecord.checkRecord(input));
    }


}