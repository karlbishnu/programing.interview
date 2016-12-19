package net.bishnu.data.structure.tree;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

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

    @Test
    public void testIsBalancedWhenSingleNodeShouldReturnTrue(){
        int[] input = new int[]{1};

        BalancedTree<Integer> tree = new BinarySearchTree<>();
        for (int element :
                input) {
            tree.add(element);
        }

        assertTrue(tree.isBalanced());
    }

    @Test
    public void testIsBalancedWhenTowNodeShouldReturnTrue(){
        int[] input = new int[]{5,1};

        BalancedTree<Integer> tree = new BinarySearchTree<>();
        for (int element :
                input) {
            tree.add(element);
        }

        assertTrue(tree.isBalanced());
    }

    @Test
    public void testIsBalancedShouldReturnFalse(){
        int[] input = new int[]{1, 2, 3};

        BalancedTree<Integer> tree = new BinarySearchTree<>();
        for (int element :
                input) {
            tree.add(element);
        }

        assertFalse(tree.isBalanced());
    }

    @Test
    public void testGetSortedArray(){
        Integer[] input = new Integer[]{5,2,0,3,-1,1,-2,6,8,7};

        BalancedTree<Integer> tree = new BinarySearchTree<>();
        for (int element :
                input) {
            tree.add(element);
        }

        Arrays.sort(input);
        Integer[] sortedInput = tree.getSortedArray();
        Arrays.equals(input, sortedInput);
    }

    @Test
    public void testBalanceTree(){
        Integer[] input = new Integer[100];
        Arrays.setAll(input, (i)->i+1);

        BalancedTree<Integer> tree = new BinarySearchTree<>();
        for (int element :
                input) {
            tree.add(element);
        }

        System.out.println(tree.getHeight());
        tree.balanceTree();
        System.out.println(tree.getHeight());
        System.out.println(tree);
    }

    @Test
    public void test(){
        Integer[] input = new Integer[]{5,2,0,3,-1,1,-2,6,8,7};

        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        for (int element :
                input) {
            tree.add(element);
        }

        Arrays.sort(input);
        tree.convertTreeToHeap();

        Assert.assertSame(-2, tree.getRoot());
        System.out.println(tree.toString());
    }
}
