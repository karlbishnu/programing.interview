package net.bishnu.data.structure.tree;

import net.bishnu.data.structure.list.LinkedQueue;
import net.bishnu.data.structure.list.Queue;

/**
 * Created by karlb on 2016-11-13.
 */
public class BinarySearchTree<T extends Comparable> implements Tree<T> {
    private Node<T> root;
    private int size;

    @Override
    public void add(T value) {
        if(root == null){
            root = new Node<T>(value);
        }else{
            add(value, root);
        }
        this.size++;
    }

    private Node<T> add(T value, Node<T> parent) {
        if(parent == null){
            return new Node<T>(value);
        }

        if(parent.value.compareTo(value)<=0){
            parent.right = add(value, parent.right);
        }else{
            parent.left = add(value, parent.left);
        }

        return parent;
    }

    @Override
    public T getRoot() {
        return root.value;
    }

    @Override
    public void remove(T value) {

    }

    @Override
    public boolean contains(T value) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public String toString(){
        Node curr = root;
        Queue<T> queue = new LinkedQueue<T>();
        queue.enqueue(root.value);
        StringBuilder sb = new StringBuilder();

        sb = printTree(root, sb, queue);
        return sb.toString();
    }

    private StringBuilder printTree(Node<T> root, StringBuilder sb, Queue<T> queue) {
        sb.append(queue.dequeue());
        /*queue.enqueue(root.left.value);
        queue.enqueue();*/
        return null;
    }
}
