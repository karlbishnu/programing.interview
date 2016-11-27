package net.bishnu.data.structure.tree;

import net.bishnu.data.structure.list.LinkedQueue;
import net.bishnu.data.structure.list.Queue;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.TreeMap;

/**
 * Created by karlb on 2016-11-13.
 */
public class BinarySearchTree<T extends Comparable> implements BalancedTree<T> {
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
    public void clean() {
        root = null;
        size = 0;
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
        return getHeight(root);
    }

    @Override
    public T[] getSortedArray() {
        T[] array = (T[]) Array.newInstance(root.value.getClass(), size);
        InorderIterator<T> inorderIterator = new InorderIterator<>(root);
        for(int i=0; i<size; i++){
            array[i] = inorderIterator.next();
        }
        return array;
    }

    private int getHeight(Node<T> root) {
        if(root == null) return 0;
        return Math.max(getHeight(root.left)+1, getHeight(root.right)+1);
    }

    @Override
    public boolean isBalanced() {
        if(size < 1)    throw new IllegalStateException("Tree is empty");

        new TreeMap<String, String>();
        return isBalanced(root);
    }

    @Override
    public void balanceTree() {
        T[] sortedArray = getSortedArray();
        clean();
        balanceTree(sortedArray, 0, sortedArray.length-1);
    }

    private static final BigDecimal TWO = new BigDecimal(2);
    private void balanceTree(T[] array, int low, int high) {
        BigDecimal hi = new BigDecimal(high);
        BigDecimal lo = new BigDecimal(low);
        BigDecimal mid = hi.add(lo).divide(TWO, BigDecimal.ROUND_UP);
        int middle;
        if(mid.equals(hi)){
            middle = array[hi.intValue()]==null ?
                    low :
                    high;
        }else{
            middle = mid.intValue();
        }

        T result = array[middle];

        if(array[low]==null && array[high]==null && array[middle]==null)   return;

        array[middle] = null;

        this.add(result);
        balanceTree(array, low, middle);
        balanceTree(array, middle, high);
    }

    private boolean isBalanced(Node<T> root){
        if(root == null) return true;
        return Math.abs(getHeight(root.left) - getHeight(root.right)) < 2;
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

    interface Iterator<T>{
        boolean hasNext();
        T next();
    }

    private class InorderIterator<T> implements Iterator<T>{
        Queue<T> queue;
        InorderIterator(Node<T> root){
            this.queue = new LinkedQueue<T>();
            enqueue(root);
        }

        private void enqueue(Node<T> root) {
            if(root.left != null){
                enqueue(root.left);
            }

            queue.enqueue(root.value);

            if(root.right != null){
                enqueue(root.right);
            }
        }

        @Override
        public boolean hasNext() {
            return !queue.isEmpty();
        }

        @Override
        public T next() {
            return queue.dequeue();
        }
    }
}
