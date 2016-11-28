package net.bishnu.data.structure.tree;

/**
 * Created by karlb on 2016-11-13.
 */
public interface Tree<T extends Comparable> {
    void add(T value);
    T getRoot();
    void remove(T value);
    void clean();
    boolean contains(T value);
    int size();
    int getHeight();
    T[] getSortedArray();
}
