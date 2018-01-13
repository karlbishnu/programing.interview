package net.bishnu.leetcode.longestUnivaluePath;

/**
 * 687. Longest Univalue Path
 * https://leetcode.com/problems/longest-univalue-path/description/
 */
public class LongestUnivaluePath {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }

    int ans = 0;
    public int longestUnivaluePath(TreeNode root){
        traverse(root);
        return ans;
    }

    private int traverse(TreeNode parent) {
        if(parent==null)    return 0;

        int left = traverse(parent.left);
        int right = traverse(parent.right);

        int tmpLeft = 0, tmpRight=0;
        if(parent.left!=null && parent.val==parent.left.val){
            tmpLeft += left+1;
        }
        if(parent.right!=null && parent.val==parent.right.val){
            tmpRight += right+1;
        }

        ans = Math.max(ans, tmpLeft+tmpRight);
        return Math.max(tmpLeft, tmpRight);
    }
}
