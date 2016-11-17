package net.bishnu.data.structure.list;

/**
 * Created by karlb on 2016-11-05.
 */
public class LinkedStack<T> implements Stack<T> {
    private int size = 0;
    private LinkedList<T> linkedList = new LinkedList<T>();

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public void push(T value) {
        linkedList.add(value);
        size++;
    }

    @Override
    public T pop() {
        if(isEmpty())   throw new IllegalStateException("Stack is empty.");
        T temp = linkedList.get(0);
        linkedList.remove(0);
        size--;
        return temp;
    }

    @Override
    public T peek() {
        if(isEmpty())   throw new IllegalStateException("Stack is empty.");
        return linkedList.get(0);
    }

    @Override
    public int size() {
        return size;
    }
}
