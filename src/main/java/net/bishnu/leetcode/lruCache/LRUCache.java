package net.bishnu.leetcode.lruCache;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by karlb on 2017-02-25.
 */
public class LRUCache {
    private class Element<K, D>{
        final K key;
        final D data;
        Element<?, ?> prev;
        Element<?, ?> next;
        Element(K key, D data){
            this.key = key;
            this.data = data;
        }
    }

    private int capacity;
    private Element<?, ?> head;
    private Element<?, ?> tail;
    private Map<Integer, Element<Integer, Integer>> map = new HashMap<>();

    public LRUCache(int capacity){
        this.capacity = capacity;
    }

    public int get(int key){
        if(!map.containsKey(key)) return -1;

        Element<Integer, Integer> element = map.get(key);
        moveToTail(element);
        return element.data;
    }

    private void moveToTail(Element<Integer, Integer> element) {
        if(isFull() && head == tail)    return;

        removeElement(element);
        tail.next = element;
        element.prev = tail;
        tail = element;
    }

    private void removeElement(Element<?, ?> element){
        Element<?, ?> prev = element.prev,
                next = element.next;
        if(prev != null) prev.next = next;
        if(next != null) next.prev = prev;
        if(head == element) head = next;
        if(tail == element) tail = prev;
    }

    private boolean isFull(){
        return capacity == map.size();
    }

    private void removeLRU(){
        if(head != null){
            removeHead();
        }
    }

    private void removeHead() {
        map.remove(head.key);
        removeElement(head);
    }

    public void put(int key, int data){
        if(map.containsKey(key)){
            Element element = map.get(key);
            if(!element.equals(data)){
                Element prev = element.prev;
                Element next = element.next;
                element = new Element<>(key, data);
                element.prev = prev;
                if(prev != null)    prev.next = element;
                element.next = next;
                if(next != null) next.prev = element;

                map.put(key, element);
            }

            moveToTail(map.get(key));
        }else{
            if(isFull())    removeLRU();
            Element<Integer, Integer> element = new Element<>(key, data);
            addOnTail(element);
            map.put(key, element);
        }
    }

    private void addOnTail(Element<?, ?> element) {
        if(tail != null){
            tail.next = element;
            element.prev = tail;
        }
        tail = element;
        if(head == null)    head = element;
    }
}
