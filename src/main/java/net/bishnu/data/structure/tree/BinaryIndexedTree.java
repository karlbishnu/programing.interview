package net.bishnu.data.structure.tree;

/**
 * Created by karlb on 2017-03-14.
 */
public class BinaryIndexedTree {
    private int[] tree;
    public BinaryIndexedTree(int[] array){
        tree = new int[array.length+1];
        for(int i=0; i<array.length; i++){
            update(i, array[i]);
        }
    }

    public void update(int index, int val){
        for(int i=index+1; i<tree.length; i+=(i&(-i))){
            tree[i] += val;
        }
    }

    int[] getTree(){
        return tree;
    }
}
