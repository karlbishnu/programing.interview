package net.bishnu.leetcode.numberOfBoomerangs;

import java.util.HashMap;
import java.util.Map;

/**
 * 447. Number of Boomerangs
 * https://leetcode.com/problems/number-of-boomerangs/#/description
 */
public class NumberOfBoomerangs {
    public static int numberOfBoomerangs(int[][] points){
        Map[] arr = new Map[points.length];
        for(int i=0; i<points.length; i++){
            arr[i] = new HashMap<Integer, Integer>();
            int x1 = points[i][0], y1=points[i][1];
            for(int j=0; j<points.length; j++){
                int diffX = x1-points[j][0];
                int diffY = y1-points[j][1];
                int dist = diffX*diffX + diffY*diffY;
                int count = arr[i].containsKey(dist) ? ((Integer) arr[i].get(dist))+1 : 1;
                arr[i].put(dist, count);
            }
            arr[i].put(0, ((Integer)arr[i].get(0))-1);
        }
        int count = 0;
        for(Map map: arr){
            for(Object key: map.keySet()){
                Integer c = (Integer) map.get(key);
                count += (c*(c-1));
            }
        }
        return count;
    }
}
