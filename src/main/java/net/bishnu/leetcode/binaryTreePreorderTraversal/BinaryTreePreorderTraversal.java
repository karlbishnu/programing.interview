package net.bishnu.leetcode.binaryTreePreorderTraversal;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 144. Binary Tree Preorder Traversal
 * https://leetcode.com/problems/binary-tree-preorder-traversal/description/
 */
public class BinaryTreePreorderTraversal {
    public static class TreeNode {
        public int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if(root==null)  return result;
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode e = stack.pop();
            result.add(e.val);
            if(e.right!=null)   stack.push(e.right);
            if(e.left!=null)    stack.push(e.left);
        }
        return result;
    }
}
