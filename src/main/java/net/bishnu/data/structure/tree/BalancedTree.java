package net.bishnu.data.structure.tree;

/**
 * Created by karlb on 2016-11-22.
 */
public interface BalancedTree<T extends Comparable> extends Tree<T> {
    boolean isBalanced();
    void balanceTree();
}
