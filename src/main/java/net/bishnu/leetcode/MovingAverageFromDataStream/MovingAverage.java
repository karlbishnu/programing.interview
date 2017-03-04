package net.bishnu.leetcode.MovingAverageFromDataStream;

/**
 * Created by karlb on 2017-03-04.
 */
public class MovingAverage {
    final int[] circularArray;
    final int maxCapacity;
    int cache, tail;
    boolean wasFull;

    public MovingAverage(int size){
        circularArray = new int[maxCapacity=size];
        cache = tail = 0;
        wasFull = false;
    }

    public double next(int val){
        if(maxCapacity == tail){
            tail %= maxCapacity;
            wasFull = true;
        }

        cache += val - circularArray[tail];
        circularArray[tail++] = val;

        return wasFull ? (double) cache/maxCapacity:
                (double) cache/tail;
    }
}
