package net.bishnu.leetcode.shortestDistanceFromAllBuilding;

import java.util.*;

/**
 * 317. Shortest Distance from All Buildings
 * https://leetcode.com/problems/shortest-distance-from-all-buildings/#/description
 * Created by karlb on 2017-04-23.
 */
public class ShortestDistanceFromAllBuilding {
    class Point{
        final int x;
        final int y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o){
            if(this == o) return true;
            if(this.getClass() != o.getClass()) return false;

            Point that = (Point) o;
            if(!Objects.equals(x, that.x))  return false;
            if(!Objects.equals(y, that.y))  return false;
            return true;
        }

        @Override
        public int hashCode(){
            return Objects.hash(x, y);
        }
    }

    public int shortestDistance(int[][] grid) {
        Map<Point, Integer[][]> map = visitGrid(grid);
        for(Point start: map.keySet()){
            Deque<Point> queue = new LinkedList<>();
            Set<Point> visited = new HashSet<>();
            queue.add(start);
            int count = 0;

            while(!queue.isEmpty()){
                Point curr = queue.poll();
                visited.add(curr);
                List<Point> nexts = getAvailable(grid, curr);
                int distance = map.get(start)[curr.x][curr.y]+1;
                for(Point next : nexts){
                    if(visited.contains(next))  continue;
                    if(grid[next.x][next.y]==0){
                        queue.add(next);
                        count++;
                        map.get(start)[next.x][next.y] = distance;
                    }
                    visited.add(next);
                }
            }
            if(count==0)    return -1;
        }

        int result = Integer.MAX_VALUE;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                int sum = 0;
                for(Point point: map.keySet()){
                    Integer[][] status = map.get(point);
                    int distance = status[i][j];
                    if(distance==-1 || distance == 0){
                        sum = Integer.MAX_VALUE;
                        break;
                    }
                    sum+=distance;
                }
                result = Math.min(result, sum);
            }
        }
        return result == Integer.MAX_VALUE ? -1 : result;
    }

    int[][] directions = new int[][]{{1,0}, {-1,0}, {0,1}, {0,-1}};
    private List<Point> getAvailable(int[][] grid, Point point) {
        List<Point> points = new LinkedList<>();
        for(int[] direction: directions){
            int row = point.x+direction[0];
            int col = point.y+direction[1];
            if(row<0||row>=grid.length || col<0||col>=grid[0].length)   continue;
            points.add(new Point(row, col));
        }
        return points;
    }

    private Map<Point, Integer[][]> visitGrid(int[][] grid) {
        Map<Point, Integer[][]> map = new HashMap<>();
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == 1){
                    Integer[][] status = new Integer[grid.length][grid[0].length];
                    for(Integer[] array: status)    Arrays.fill(array, -1);
                    status[i][j] = 0;
                    map.put(new Point(i, j), status);
                }
            }
        }
        return map;
    }
}
