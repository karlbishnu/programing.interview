package net.bishnu.kakao.first2017.round1.no5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NewsClustering {
    public static int calcJaccard(String str1, String str2){
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();
        int skip=0;

        Map<String, Integer> countMap1 = new HashMap<>();

        int intersection = 0;

        for(int i=1,prev=0; i<s1.length(); i++,prev++){
            String sub = s1.substring(prev,i+1);
            if(!sub.matches("[a-z]{2}")){
                skip++;
                continue;
            }

            countMap1.put(sub, countMap1.containsKey(sub) ? countMap1.get(sub)+1 : 1);
        }


        for(int i=1,prev=0; i<s2.length(); i++,prev++){
            String sub = s2.substring(prev,i+1);
            if(!sub.matches("[a-z]{2}")){
                skip++;
                continue;
            }
            if(countMap1.containsKey(sub) && countMap1.get(sub)>0){
                intersection++;
                countMap1.put(sub, countMap1.get(sub)-1);
            }
        }

        int union = s1.length()-1 + s2.length()-1 - intersection - skip;

        return intersection==0 && union ==0 ? 65536 : (int) ((((double) intersection) / union) * 65536);
    }
}
