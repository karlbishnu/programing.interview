package net.bishnu.leetcode.binaryTreeLevelOrderTraversalII;

import net.bishnu.leetcode.symmetricTree.SymmetricTree;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeLevelOrderTraversalIITest {
    @Test
    public void levelOrderBottom() throws Exception {
        BinaryTreeLevelOrderTraversalII.TreeNode input = valueOf(new Integer[]{3,9,20,null,null,15,7}, 0);
        List<List<Integer>> expected = valueOf(new Integer[][]{{15,7},{9,20},{3}});
        assertEquals(expected, BinaryTreeLevelOrderTraversalII.levelOrderBottom(input));
    }

    private List<List<Integer>> valueOf(Integer[][] integers) {
        List<List<Integer>> result = new LinkedList<>();
        for(Integer[] a: integers){
            List<Integer> list = Arrays.asList(a);
            result.add(list);
        }
        return result;
    }


    private BinaryTreeLevelOrderTraversalII.TreeNode valueOf(Integer[] array, int index){
        if(index>=array.length || array[index] == null) return null;
        BinaryTreeLevelOrderTraversalII.TreeNode root = new BinaryTreeLevelOrderTraversalII.TreeNode(array[index]);
        root.left=valueOf(array, index*2+1);
        root.right=valueOf(array, index*2+2);
        return root;
    }
}