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
        if(size < 1) return "Tree is empty.";

        Node curr = root;
        Queue<QueueElement<Node<T>>> queue = new LinkedQueue<>();
        queue.enqueue(new QueueElement<>(root, 0));
        StringBuilder sb = new StringBuilder();

        sb = printTree(sb, queue);
        return sb.toString();
    }

    private class QueueElement<T>{
        final T node;
        final int level;

        QueueElement(T node, int level){
            this.node = node;
            this.level = level;
        }
    }

    private StringBuilder printTree(StringBuilder sb, Queue<QueueElement<Node<T>>> queue) {
        int currLevel = -1;

        while(!queue.isEmpty()){
            QueueElement<Node<T>> e = queue.dequeue();

            if(e.level > currLevel){
                sb.append(System.lineSeparator());
                currLevel++;
            }else{
                sb.append('\t');
            }
            sb.append(e.node.value);
            if(e.node.left != null){
                queue.enqueue(new QueueElement<>(e.node.left, e.level+1));
            }
            if(e.node.right != null){
                queue.enqueue(new QueueElement<>(e.node.right, e.level+1));
            }

        }

        return sb;
    }
}
