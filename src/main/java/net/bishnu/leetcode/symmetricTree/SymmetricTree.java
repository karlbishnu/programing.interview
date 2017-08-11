package net.bishnu.leetcode.symmetricTree;

import java.util.*;

/**
 * 101. Symmetric Tree
 * https://leetcode.com/problems/symmetric-tree/description/
 */
public class SymmetricTree {
    public static class TreeNode {
        public int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static boolean isSymmetric(TreeNode root){
        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int qSize = q.size();
            Deque<TreeNode> rev = new LinkedList<>(q);
            Collections.reverse((List)rev);
            for(int i=0; i<qSize; i++){
                TreeNode e = q.poll();
                TreeNode r = rev.poll();
                if(e==null && r==null)  continue;
                if(e == null || r == null || e.val != r.val)    return false;
                q.add(e.left);
                q.add(e.right);
            }
        }
        return true;
    }
}
