package net.bishnu.leetcode.kEmptySlots;

import java.util.TreeSet;

/**
 * 683. K Empty Slots
 * https://leetcode.com/problems/k-empty-slots/description/
 */
public class KEmptySlots {
    public int kEmptySlots(int[] flowers, int k) {
        TreeSet<Integer> treeSet =  new TreeSet<>();
        for(int i=0; i<flowers.length; i++){
            treeSet.add(flowers[i]);
            Integer lower  = treeSet.lower(flowers[i]);
            Integer higher  = treeSet.higher(flowers[i]);

            if(lower!=null && flowers[i]-lower-1==k ||
                    higher!=null && higher-flowers[i]-1==k){
                return i+1;
            }
        }
        return -1;
    }
}
