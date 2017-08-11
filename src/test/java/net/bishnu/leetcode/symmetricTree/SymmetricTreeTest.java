package net.bishnu.leetcode.symmetricTree;

import org.junit.Test;

import static org.junit.Assert.*;

public class SymmetricTreeTest {
    @Test
    public void isSymmetric() throws Exception {
        SymmetricTree.TreeNode input = valueOf(new Integer[]{1,2,2,null,3,null,3}, 0);
        boolean expected = false;
        assertEquals(expected, SymmetricTree.isSymmetric(input));
    }

    @Test
    public void isSymmetric2() throws Exception {
        SymmetricTree.TreeNode input = valueOf(new Integer[]{1,2,2,3,4,4,3}, 0);
        boolean expected = true;
        assertEquals(expected, SymmetricTree.isSymmetric(input));
    }

    private SymmetricTree.TreeNode valueOf(Integer[] array, int index){
        if(index>=array.length || array[index] == null) return null;
        SymmetricTree.TreeNode root = new SymmetricTree.TreeNode(array[index]);
        root.left=valueOf(array, index*2+1);
        root.right=valueOf(array, index*2+2);
        return root;
    }

}