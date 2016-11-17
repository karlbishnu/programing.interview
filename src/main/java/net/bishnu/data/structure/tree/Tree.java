package net.bishnu.data.structure.tree;

/**
 * Created by karlb on 2016-11-13.
 */
public interface Tree<T> {
    void add(T value);
    T getRoot();
    void remove(T value);
    boolean contains(T value);
    int size();
    int getHeight();
}
