package net.bishnu.data.structure;

/**
 * Created by karlb on 2016-11-06.
 */
public interface List<T> {
    boolean isEmpty();
    void add(T value);
    void remove(int index);
    T get(int index);
}
