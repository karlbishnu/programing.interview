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
        Element<Integer, Integer> element = map.get(key);
        if(element == null) return -1;
        moveToTail(element);
        return element.data;
    }

    private void moveToTail(Element<Integer, Integer> element) {
        if(isFull() && head == tail)    return;
        Element<?, ?> prev = element.prev,
                next = element.next;
        if(prev != null) prev.next = next;
        if(next != null) next.prev = prev;
        if(head == element) head = next;
        tail.next = element;
        element.prev = tail;
        tail = element;
    }

    private boolean isFull(){
        return capacity == map.size();
    }

    private void removeLRU(){
        if(head != null){
            if(head.next != null)   head.next.prev = null;
            if(head == tail)    tail = null;
            map.remove(head.key);
            head = head.next;
        }
    }

    public void put(int key, int data){
        if(map.containsKey(key)){
            moveToTail(map.get(key));
        }else{
            if(isFull())    removeLRU();
            Element<Integer, Integer> element = new Element<>(key, data);
            if(tail != null){
                tail.next = element;
            }
            element.prev = tail;
            tail = element;
            if(head == null)    head = element;
            map.put(key, element);
        }
    }
}
