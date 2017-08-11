package net.bishnu.leetcode.binaryTreePreorderTraversal;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreePreorderTraversalTest {
    @Test
    public void preorderTraversal() throws Exception {
        BinaryTreePreorderTraversal.TreeNode input = valueOf(new Integer[]{1,null,2,null,null,3}, 0);
        List<Integer> expected = Arrays.asList(new Integer[]{1,2,3});
        assertEquals(expected, BinaryTreePreorderTraversal.preorderTraversal(input));
    }

    private BinaryTreePreorderTraversal.TreeNode valueOf(Integer[] array, int index){
        if(index>=array.length || array[index] == null) return null;
        BinaryTreePreorderTraversal.TreeNode root = new BinaryTreePreorderTraversal.TreeNode(array[index]);
        root.left=valueOf(array, index*2+1);
        root.right=valueOf(array, index*2+2);
        return root;
    }
}