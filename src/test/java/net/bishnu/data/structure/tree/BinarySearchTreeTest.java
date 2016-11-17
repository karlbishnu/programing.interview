package net.bishnu.data.structure.tree;

import org.junit.Test;

/**
 * Created by karlb on 2016-11-13.
 */
public class BinarySearchTreeTest {
    @Test
    public void addTest(){
        int[] test = new int[]{5,1,3, 6};

        Tree<Integer> tree = new BinarySearchTree<>();
        for (int element :
                test) {
            tree.add(element);
            System.out.println(tree.toString());
        }

    }
}
