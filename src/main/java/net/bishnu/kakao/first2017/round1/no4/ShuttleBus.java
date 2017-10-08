package net.bishnu.kakao.first2017.round1.no4;

import java.util.Arrays;

public class ShuttleBus {
    public static String getTheLastTime(int n, int t, int m, String[] timetable){
        String theFirstBus = "09:00";
        String currBus = theFirstBus;
        String theLastBus = getTimeString(getTimeInteger(theFirstBus) + ((n-1) * t));
        int firstInLastBus = -1;

        Arrays.sort(timetable);

        for(int i=0, tmp=m, bus=1; i<timetable.length; i++, tmp--){
            if(bus==n){
                if(currBus.compareTo(timetable[i])>=0)  firstInLastBus=i;
                break;
            }
            if (tmp == 1 || currBus.compareTo(timetable[i]) < 0) {
                bus++;
                currBus= getTimeString(getTimeInteger(theFirstBus) + t);
                if(bus==n && tmp!=0){
                    firstInLastBus=i;
                    break;
                }
                tmp=m;
            }
        }
        if(firstInLastBus==-1)  return theLastBus;
        for(int i=firstInLastBus, cnt=0; cnt<m && i<timetable.length; i++, cnt++){
            if(cnt==m-1)    return getTimeString(getTimeInteger(timetable[i])-1);
        }
        return theLastBus;

    }

    private static String getTimeString(int i) {
        return String.format("%02d:%02d", i/60, i%60);
    }

    public static int getTimeInteger(String time){
        String[] split = time.split(":");
        return Integer.parseInt(split[0])*60 + Integer.parseInt(split[1]);
    }
}
