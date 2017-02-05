package net.bishnu.leetcode.findModeInBST;

/**
 * Created by karlb on 2017-02-05.
 * 501. Find Mode in Binary Search Tree
 */
public class Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){this.val = val;}
    }


    long currVal = Long.MIN_VALUE;
    int currCount;
    int[] modes;
    int modeCount;
    int maxCount;

    public int[] findMode(TreeNode root){
        if(root == null) return null;
        traverse(root);
        modes = new int[modeCount];
        currVal = Long.MIN_VALUE;
        modeCount = 0;
        traverse(root);
        return modes;
    }

    private void traverse(TreeNode root) {
        if(root.left != null) traverse(root.left);
        handleVal(root.val);
        if(root.right != null) traverse(root.right);
    }

    private void handleVal(int val) {
        if (val != currVal) {
            currVal = val;
            currCount = 0;
        }
        currCount++;
        if (currCount > maxCount) {
            maxCount = currCount;
            modeCount = 1;
        } else if (currCount == maxCount) {
            if (modes != null)
                modes[modeCount] = (int) currVal;
            modeCount++;
        }
    }

}
