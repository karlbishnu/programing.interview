package net.bishnu.leetcode.numberOfIslandsII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 305. Number of Islands II
 * https://leetcode.com/problems/number-of-islands-ii/#/description
 * Created by karlb on 2017-05-02.
 */
public class NumberOfIslandsII {
    private Integer[][] newMap(int m, int n){
        Integer[][] map = new Integer[m][n];
        for(Integer[] array: map)
            Arrays.fill(array, 0);
        return map;
    }

    public List<Integer> numIslands2(int m, int n, int[][] positions){
        List<Integer[][]> maps = new LinkedList<>();
        maps.add(newMap(m,n));
        List<Integer> result = new ArrayList<>(positions.length);
        for(int[] position: positions){
            int placedCount = placeIsland(position, maps);
            int after = maps.size();
            result.add(after-placedCount);
        }
        return result;
    }

    private int placeIsland(int[] position, List<Integer[][]> maps) {
        int count = 0;
        for(Integer[][] map: maps){
            if(adjacentLandExist(map,position)){
                map[position[0]][position[1]] = 1;
                count++;
            }
        }
        if(count == 0){
            Integer[][] map = newMap(maps.get(0).length, maps.get(0)[0].length);
            map[position[0]][position[1]] = 1;
            maps.add(map);
            count++;
        }
        return count;
    }

    private int[][] directions = new int[][]{{1,0}, {-1,0}, {0,0}, {0,1}, {0,-1}};
    private boolean adjacentLandExist(Integer[][] map, int[] position) {
        int i = map.length, j = map[0].length;
        for(int[] direction: directions){
            int m = position[0] + direction[0];
            int n = position[1] + direction[1];
            if(m>=0 && m<i && n>=0 && n<j && map[m][n]==1)  return true;
        }
        return false;
    }
}
