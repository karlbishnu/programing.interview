package net.bishnu.kakao.first2017.round1.no3;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Cache {
    public static int Cache(int size, String[] cities){
        Set<String> cache = new HashSet<>(size);
        Deque<String> q = new LinkedList<>();

        int result = 0;

        for(String city: cities){
            String lower= city.toLowerCase();
            if (cache.contains(lower)) {
                result++;
                q.remove(lower);
                q.addLast(lower);
            }else{
                result+=5;
                if(cache.size() == size)    cache.remove(q.poll());
                q.addLast(lower);
                cache.add(lower);
            }
        }
        return result;
    }
}
