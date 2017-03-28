package net.bishnu.leetcode.binaryTreeLongestConsecutiveSequence;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static net.bishnu.leetcode.binaryTreeLongestConsecutiveSequence.BinaryTreeLongestConsecutiveSequence.*;

/**
 * Created by karlb on 2017-03-28.
 */
public class BinaryTreeLongestConsecutiveSequenceTest {
    @Test
    public void longestConsecutive1() throws Exception {
        BinaryTreeLongestConsecutiveSequence solution = new BinaryTreeLongestConsecutiveSequence();
        TreeNode root = new TreeNode(1);
        TreeNode right =right(root, 3);
        left(right, 2);
        right(right(right, 4), 5);

        int expected = 3;
        Assert.assertEquals(expected, solution.longestConsecutive(root));
    }

    @Test
    public void longestConsecutive2() throws Exception {
        BinaryTreeLongestConsecutiveSequence solution = new BinaryTreeLongestConsecutiveSequence();
        TreeNode root = new TreeNode(2);
        left(left(right(root, 3), 2), 1);

        int expected = 2;
        Assert.assertEquals(expected, solution.longestConsecutive(root));
    }

    @Test
    public void longestConsecutive3() throws Exception {
        BinaryTreeLongestConsecutiveSequence solution = new BinaryTreeLongestConsecutiveSequence();
        TreeNode root = new TreeNode(2);

        int expected = 1;
        Assert.assertEquals(expected, solution.longestConsecutive(root));
    }

    TreeNode right(TreeNode root, int val){
        root.right = new TreeNode(val);
        return root.right;
    }

    TreeNode left(TreeNode root, int val){
        root.left = new TreeNode(val);
        return root.left;
    }
}