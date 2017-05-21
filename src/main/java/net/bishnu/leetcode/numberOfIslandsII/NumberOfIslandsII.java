package net.bishnu.leetcode.numberOfIslandsII;

import java.util.*;

/**
 * 305. Number of Islands II
 * https://leetcode.com/problems/number-of-islands-ii/#/description
 * Created by karlb on 2017-05-02.
 */
public class NumberOfIslandsII {
    class Point{
        int x;
        int y;
        Point(int x, int y){
            this.x=x;
            this.y=y;
        }
        @Override
        public boolean equals(Object o){
            if(this==o) return true;
            if(o==null || this.getClass()!=o.getClass()) return false;
            Point that = (Point) o;
            if(!Objects.equals(x,that.x))   return false;
            if(!Objects.equals(y,that.y))   return false;
            return true;
        }
        @Override
        public int hashCode(){
            return Objects.hash(x, y);
        }
    }
    public List<Integer> numIslands2(int m, int n, int[][] positions){
        List<Integer> result = new ArrayList<>(positions.length);
        Set<Point> roots = new HashSet<>();
        Set<Point> updatableRoots = new HashSet<>();
        Set[] parentSets = new Set[positions.length];

        for(int i=0; i<positions.length; i++){
            Point position = new Point(positions[i][0], positions[i][1]);
            parentSets[i] = findParents(positions, position, i);
            if(parentSets[i].size()==1 && parentSets[i].contains(position)){
                roots.add(position);
                updatableRoots.add(position);
            }else{
                int removedRoots = 0;
                Iterator<Point> iterator = updatableRoots.iterator();
                while(iterator.hasNext()){
                    Point updatableRoot = iterator.next();
                    if(parentSets[i].contains(updatableRoot)){
                        iterator.remove();
                        if(parentSets[i].size()>1){
                            roots.remove(updatableRoot);
                            removedRoots++;
                        }
                    }
                }
                if(removedRoots==parentSets[i].size())
                    roots.add(position);

            }

            result.add(roots.size());
        }
        return result;
    }

    private Set findParents(int[][] positions, Point position, int i) {
        Set<Point> parents = new HashSet<>();
        for(int j=i-1; j>=0; j--){
            int[] candidate = positions[j];
            if(Math.abs(position.x-candidate[0])+Math.abs(position.y-candidate[1])<=1){
                parents.add(new Point(candidate[0], candidate[1]));
            }
        }
        if(parents.size()==0)   parents.add(position);
        return parents;
    }


}
