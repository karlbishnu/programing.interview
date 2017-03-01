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

        unLinkElement(element);
        if(tail != null){
            tail.next = element;
            element.prev = tail;
        }

        if(head == null){
            head =element;
        }
        tail = element;
    }

    private void unLinkElement(Element<?, ?> element){
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
        unLinkElement(head);
    }

    public void put(int key, int data){
        Element element;
        if(map.containsKey(key)){
            element = map.get(key);
            if(!element.equals(data)){
                unLinkElement(element);
                map.remove(key);
                element = new Element<>(key, data);
                map.put(key, element);
            }

            moveToTail(element);
        }else{
            if(isFull())    removeLRU();

            element = new Element<>(key, data);
            moveToTail(element);
            map.put(key, element);
        }
    }
}
