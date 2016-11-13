package net.bishnu.data.structure.list;

/**
 * Created by karlb on 2016-11-06.
 */
public class LinkedList<T> implements List<T>{
    private Element<T> head = null;

    @Override
    public void add(T value){
        Element<T> e = new Element<>();
        e.value = value;
        e.next = head;
        head = e;
    }

    @Override
    public void remove(int index) {
        if(isEmpty()) throw new IllegalStateException("List is empty");

        Element<T> curr = head, prev = null;
        int i=0;
        for(; i< index; i++){
            if(curr == null) break;
            prev = curr;
            curr = curr.next;
        }

        if(curr == null) throw new IllegalArgumentException("Invalid index. Max index is " + i);

        if(curr == head) head = curr.next;
        else prev.next = curr.next;
    }

    @Override
    public T get(int index) {
        if(isEmpty()) throw new IllegalStateException("List is empty");

        Element<T> curr = head;
        int i=0;
        for(; i<index; i++){
            if(curr == null) break;
            curr = curr.next;
        }
        if(curr == null) throw new IllegalArgumentException("Invalid index. Max index is " + i);
        return curr.value;
    }

    @Override
    public boolean isEmpty() {
        return head==null ? true : false;
    }


    public T findItemFromEnd(int index){
        if(index < 0) throw new IllegalArgumentException("The Minimum index is 0");

        int i=0;
        Element<T> curr = head, theItem = new Element<T>();
        while(curr != null){
            if(i==index)    theItem = head;
            else if(i>index)    theItem = theItem.next;
            curr = curr.next;
            i++;
        }

        return theItem.value;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        Element<T> curr = head;
        while(curr != null){
            if(curr == head)    sb.append(curr.value.toString());
            else{
                sb.append(" -> ")
                        .append(curr.value.toString());
            }
            curr = curr.next;
        }

        return sb.toString();
    }
}
