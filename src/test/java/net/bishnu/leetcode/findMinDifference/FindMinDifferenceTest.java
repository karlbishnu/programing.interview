package net.bishnu.leetcode.findMinDifference;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2017-03-16.
 */
public class FindMinDifferenceTest {
    FindMinDifference findMinDifference = new FindMinDifference();
    @Test
    public void findMinDifference() throws Exception {
        String[] times = new String[]{"09:22","04:10","07:19","00:34","12:58"};
        List<String> timePoints =  new ArrayList<String>();
        for(String time: times){
            timePoints.add(time);
        }
        int expected = 123;
        int result = findMinDifference.findMinDifference(timePoints);

        Assert.assertEquals(expected, result);
    }

}