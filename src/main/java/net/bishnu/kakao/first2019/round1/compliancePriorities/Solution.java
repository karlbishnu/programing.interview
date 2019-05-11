package net.bishnu.kakao.first2019.round1.compliancePriorities;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


/**
 *
 */
public class Solution {
    public static List<Integer> reassignedPriorities(List<Integer> issuePriorities) {
        List<Integer>[] priorities = initPriorities(issuePriorities);
        List<List<Integer>> minPriorities = minimize(priorities);

        Integer[] ans = new Integer[issuePriorities.size()];
        for(int i=1; i<minPriorities.size(); i++){
            List<Integer> issues = minPriorities.get(i);
            for(Integer item: issues){
                ans[item] = i;
            }
        }
        return Arrays.asList(ans);
    }

    private static List<Integer>[] initPriorities(List<Integer> list){
        List<Integer>[] res = new List[100];
        res[0] = new LinkedList<>();

        for(int i=0; i<list.size(); i++){
            Integer issue = list.get(i);
            List<Integer> issues = res[issue]==null ? new LinkedList<>() : res[issue];
            issues.add(i);
            res[issue] = issues;
        }
        return res;
    }

    private static List<List<Integer>> minimize(List<Integer>[] lists){
        List<List<Integer>> res = new LinkedList<>();
        for(List<Integer> list: lists){
            if(list != null){
                res.add(list);
            }
        }
        return res;
    }
}
