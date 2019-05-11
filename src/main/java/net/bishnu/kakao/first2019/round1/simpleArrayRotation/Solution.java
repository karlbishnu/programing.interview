package net.bishnu.kakao.first2019.round1.simpleArrayRotation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Solution {

    public static List<Integer> getMaxElementIndexes(List<Integer> a, List<Integer> rotate) {
        List<Integer> ans = new ArrayList<>(rotate.size());
        int maxIndex = 0;
        Iterator<Integer> iterator = a.iterator();
        Integer max = iterator.next();

        for(int i=1; i<a.size(); i++){
            Integer candidate = iterator.next();
            if(max<candidate){
                max = candidate;
                maxIndex = i;
            }
        }

        int maxRotate = a.size();
        for(Integer r: rotate){
            ans.add((maxIndex-(r%maxRotate)+maxRotate)%maxRotate);
        }
        return ans;
    }
}
