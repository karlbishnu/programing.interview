package net.bishnu.leetcode.binaryTreeLevelOrderTraversalII;



import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 107. Binary Tree Level Order Traversal II
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/
 */
public class BinaryTreeLevelOrderTraversalII {
    public static class TreeNode {
        public int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if(root==null)  return result;
        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int qSize = q.size();
            List<Integer> level = new ArrayList<>(qSize);
            for(int i=0; i<qSize; i++){
                TreeNode e = q.poll();
                level.add(e.val);
                if(e.left!=null)    q.add(e.left);
                if(e.right!=null)   q.add(e.right);
            }
            result.add(0, level);
        }
        return result;
    }
}
