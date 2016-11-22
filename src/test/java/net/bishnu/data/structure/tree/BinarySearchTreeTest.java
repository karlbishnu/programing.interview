package net.bishnu.data.structure.tree;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by karlb on 2016-11-13.
 */
public class BinarySearchTreeTest {
    @Test
    public void addTest(){
        int[] input = new int[]{5,1,3, 6, 5, 1, 2,34,30};

        Tree<Integer> tree = new BinarySearchTree<>();
        for (int element :
                input) {
            tree.add(element);
        }

        System.out.println(tree.toString());

    }

    @Test
    public void testGetHeightWhenEmptyTreeShouldReturn0(){
        Tree<Integer> tree = new BinarySearchTree<>();
        assertEquals(0, tree.getHeight());
    }

    @Test
    public void testGetHeightWhenSingleNodeShouldReturn1(){
        Tree<Integer> tree = new BinarySearchTree<>();
        tree.add(1);
        assertEquals(1, tree.getHeight());
    }

    @Test
    public void testGetHeightWhenTwoNodeShouldReturn2(){
        int[] input = new int[]{5,1};

        Tree<Integer> tree = new BinarySearchTree<>();
        for (int element :
                input) {
            tree.add(element);
        }
        assertEquals(2, tree.getHeight());
    }
}
