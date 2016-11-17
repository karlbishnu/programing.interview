package net.bishnu.data.structure.list;

/**
 * Created by karlb on 2016-11-17.
 */
public class LinkedQueue<T> implements Queue<T> {
    private Element<T> head, tail;
    private int size;

    @Override
    public void enqueue(T value) {
        Element<T> e = new Element<T>();
        e.value = value;
        if(isEmpty()) head = tail = e;
        else{
            tail.next = e;
            tail = e;
        }
        size++;
    }

    @Override
    public T dequeue() {
        if(isEmpty()) throw new IllegalStateException("Queue is empty.");
        Element<T> tmp = head;
        head = head==tail ? tail=null : head.next;
        size--;
        return tmp.value;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T peek() {
        if(isEmpty()) throw new IllegalStateException("Queue is empty.");
        return head.value;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Head ->");
        Element<T> curr = head;
        while(curr != tail){
            sb.append(curr.value)
                    .append("->");
            curr = curr.next;
        }
        if(curr != null)    sb.append(curr.value);
        sb.append("<- Tail");
        return sb.toString();
    }
}
