package net.bishnu.leetcode.findMinDifference;

import java.util.Arrays;
import java.util.List;

/**
 * Created by karlb on 2017-03-16.
 */
public class FindMinDifference {
    public int findMinDifference(List<String> timePoints){
        int[] array = new int[timePoints.size()];

        for(int i=0; i<timePoints.size(); i++){
            array[i] = timeToInt(timePoints.get(i));
        }
        Arrays.sort(array);
        int minDiff = Integer.MAX_VALUE;
        for(int i=0; i<array.length-1; i++){
            int diff = array[i+1] - array[i];
            minDiff = diff<minDiff ? diff : minDiff;
        }

        int corner = array[0] + (24*60 - array[array.length-1]);
        return minDiff < corner? minDiff : corner;
    }

    private int timeToInt(String time) {
        String[] t = time.split(":");
        int mins = Integer.valueOf(t[0])*60 + Integer.valueOf(t[1]);
        return mins;
    }
}
