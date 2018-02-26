package net.bishnu.leetcode.maximumVacationDays;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 568. Maximum Vacation Days
 * https://leetcode.com/problems/maximum-vacation-days/description/
 */
public class MaximumVacationDays {
    public int maxVacationDays(int[][] flights, int[][] days) {
        int[] ans = initAns(flights);

        for(int i=0; i<ans.length; i++){
            if(i==0 || flights[0][i]==1)
                ans[i]= days[i][0];
        }

        for(int w=1; w<days[0].length; w++){
            int[] preWeek = new int[ans.length];
            for(int i=0; i<ans.length; i++) preWeek[i]=ans[i];
            for(int city = 0; city<days.length; city++){
                if(ans[city]==-1)   continue;
                for(int dep=0; dep<ans.length; dep++){
                    if(dep==city || flights[dep][city]==1){
                        ans[city] = Math.max(ans[city], preWeek[dep]);
                    }
                }
                ans[city]+= days[city][w];
            }
        }

        int maxAns = 0;
        for(int n: ans){
            maxAns = Math.max(n,maxAns);
        }
        return maxAns;
    }

    private int[] initAns(int[][] flights){
        int[] ans = new int[flights.length];
        Arrays.fill(ans, -1);

        bfs(flights, ans);
        return ans;
    }

    private void bfs(int[][] flights, int[] ans){
        Deque<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[ans.length];

        q.add(flights[0][0]);
        while(!q.isEmpty()){
            int count = q.size();
            for(int i=0; i<count; i++){
                int city = q.poll();
                visited[city] = true;
                ans[city] = 0;
                int[] nexts = flights[city];
                for(int j=0; j<nexts.length; j++){
                    if(!visited[j] && nexts[j]==1){
                        q.add(j);
                    }
                }
            }
        }
    }
}
