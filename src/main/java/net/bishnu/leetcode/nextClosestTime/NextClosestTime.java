package net.bishnu.leetcode.nextClosestTime;

import java.util.TreeSet;

/**
 * 681. Next Closest Time
 * https://leetcode.com/problems/next-closest-time/description/
 */
public class NextClosestTime {
    public String nextClosestTime(String time){
        TreeSet<String> hours = new TreeSet<>();
        TreeSet<String> mins = new TreeSet<>();
        for(char c1: time.toCharArray()){
            if(c1==':') continue;
            for(char c2: time.toCharArray()){
                if(c2==':') continue;
                String s = String.format("%c%c", c1, c2);
                if(s.compareTo("23")<=0)    hours.add(s);
                if(s.compareTo("59")<=0)    mins.add(s);
            }
        }

        StringBuilder sb= new StringBuilder();
        String[] split = time.split(":");
        if(mins.higher(split[1])==null){
            sb.append(hours.higher(split[0])==null ? hours.first() : hours.higher(split[0]))
                    .append(':')
                    .append(mins.first());
        }else {
            sb.append(split[0]).append(':').append(mins.higher(split[1]));
        }
        return sb.toString();
    }
}
