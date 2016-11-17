package net.bishnu.data.structure.tree;

/**
 * Created by karlb on 2016-11-13.
 */
class Node<T> {
    final T value;
    Node left;
    Node right;

    Node(T value){
        this.value = value;
    }

    @Override
    public String toString(){        ;
        return value.toString();
    }
}
