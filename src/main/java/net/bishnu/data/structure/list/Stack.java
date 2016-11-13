package net.bishnu.data.structure.list;

/**
 * Created by karlb on 2016-11-05.
 */
public interface Stack<T> {
    boolean isEmpty();
    void push(T value);
    T pop();
    T peek();
    int size();
}
