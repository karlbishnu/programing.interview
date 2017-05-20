package net.bishnu.leetcode.numberOfIslandsII;

import java.util.*;

/**
 * 305. Number of Islands II
 * https://leetcode.com/problems/number-of-islands-ii/#/description
 * Created by karlb on 2017-05-02.
 */
public class NumberOfIslandsII {
    public List<Integer> numIslands2(int m, int n, int[][] positions){
        List<Integer> result = new ArrayList<>(positions.length);
        Set<Integer[]> roots = new HashSet<>();
        Set<Integer[]> updatableRoots = new HashSet<>();
        Set[] parentSets = new Set[positions.length];

        for(int i=0; i<positions.length; i++){
            Integer[] position = new Integer[]{positions[i][0], positions[i][1]};
            parentSets[i] = findParents(positions, position, i);
            if(parentSets[i].size()==1 && parentSets[i].contains(position)){
                roots.add(position);
                updatableRoots.add(position);
            }else{
                for(Integer[] updatableRoot: updatableRoots){
                    if(parentSets[i].contains(updatableRoot)){
                        updatableRoots.remove(updatableRoot);
                        if(parentSets[i].size()>1){
                            roots.remove(updatableRoot);
                        }
                    }
                }
            }

            result.add(roots.size());
        }
        return result;
    }

    private Set findParents(int[][] positions, Integer[] position, int i) {
        Set<Integer[]> parents = new HashSet<>();
        for(int j=i-1; j>=0; j--){
            int[] candidate = positions[j];
            if(Math.abs(position[0]-candidate[0])+Math.abs(position[1]-candidate[1])<=1){
                parents.add(new Integer[]{candidate[0], candidate[1]});
            }
        }
        if(parents.size()==0)   parents.add(position);
        return parents;
    }


}
