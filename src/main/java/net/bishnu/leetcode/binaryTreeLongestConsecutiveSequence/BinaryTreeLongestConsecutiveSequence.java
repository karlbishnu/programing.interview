package net.bishnu.leetcode.binaryTreeLongestConsecutiveSequence;

/**
 * Created by karlb on 2017-03-28.
 */
public class BinaryTreeLongestConsecutiveSequence {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int longestConsecutive(TreeNode root) {
        if(root == null)    return 0;
        int longest = dfs(root, 0);
        return longest+1;
    }

    private int dfs(TreeNode root, int length) {
        int left=0, right=0;
        if(root.left != null){
            left = (root.left.val-root.val)==1 ? length+1 : 0;
            left = dfs(root.left, left);
        }

        if(root.right != null){
            right = (root.right.val-root.val)==1 ? length+1 : 0;
            right = dfs(root.right, right);
        }
        return left>right ?
                left>length ? left : length :
                right>length ? right : length;
    }
}
