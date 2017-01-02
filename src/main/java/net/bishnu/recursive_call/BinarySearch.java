package net.bishnu.recursive_call;

/**
 * Created by karlb on 2017-01-02.
 */
public class BinarySearch {
    static int call = 0;
    public static int binSearch(int[] array, int val){
        call = 0;
        return binSearch(array, val, 0, array.length-1);
    }

    private static int binSearch(int[] array, int val, int low, int high) {
        call++;
        if(low>high) return -1;
        int mid = (low + high)/2;
        if(val == array[mid])   return mid;
        else if(val > array[mid])   return binSearch(array, val, mid+1, high);
        else return binSearch(array, val, low, mid-1);
    }
}
