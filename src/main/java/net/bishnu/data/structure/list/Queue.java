package net.bishnu.data.structure.list;

/**
 * Created by karlb on 2016-11-17.
 */
public interface Queue<T> {
    void enqueue(T value);
    T dequeue();
    boolean isEmpty();
    int size();
    T peek();
}
