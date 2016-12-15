package net.bishnu.data.structure.array;

/**
 * Created by karlb on 2016-12-05.
 */
public final class QuickSort<T extends Comparable> implements Sort<T> {
    public QuickSort(){}

    @Override
    public void sort(T[] array) {
        quickSort(array, 0, array.length-1);
    }

    private void quickSort(T[] array, int left, int right) {
        if(left > right) return;

        int pivotIndex = selectPivot(array, left, right);
        int newPivotIndex = partition(array, left, right, pivotIndex);
        quickSort(array, left, newPivotIndex-1);
        quickSort(array, newPivotIndex+1, right);
    }

    private int partition(T[] array, int left, int right, int pivotIndex) {
        swap(array, right, pivotIndex);
        pivotIndex = right;
        int storedIndex = left;

        for(int i=left; i<right; i++){
            if(array[pivotIndex].compareTo(array[i]) >= 0){
                swap(array, storedIndex, i);
                storedIndex++;
            }
        }
        swap(array, pivotIndex, storedIndex);
        return storedIndex;
    }

    private void swap(T[] array, int left, int right) {
        T tmp = array[left];
        array[left] = array[right];
        array[right] = tmp;
    }

    private int selectPivot(T[] array, int left, int right) {
        return right;
    }
}
