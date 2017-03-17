package net.bishnu.data.structure.tree;

/**
 * Created by karlb on 2017-03-14.
 */
public class BinaryIndexedTree {
    private int[] a;
    private int[] tree;
    public BinaryIndexedTree(int[] array){
        a = new int[array.length];
        tree = new int[array.length+1];
        for(int i=0; i<array.length; i++){
            update(i, array[i]);
        }

        System.arraycopy(array, 0, a, 0, array.length);
    }

    public void update(int index, int val){
        int diff = val - a[index];
        for(int i=index+1; i<tree.length; i+=(i&(-i))){
            tree[i] += diff;
        }
    }

    public int getSum(int index){
        int result = 0;
        for(int i=index+1; i>0; i-=(i&(-i))){
            result+=tree[i];
        }
        return result;
    }

    public int getSum(int start, int end){
        return start==end? 0 : getSum(end)-getSum(start-1);
    }

    int[] getTree(){
        return tree;
    }
}
