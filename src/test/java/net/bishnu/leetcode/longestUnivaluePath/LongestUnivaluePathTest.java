package net.bishnu.leetcode.longestUnivaluePath;

import org.junit.Test;

import static org.junit.Assert.*;
import static net.bishnu.leetcode.longestUnivaluePath.LongestUnivaluePath.TreeNode;

/**
 * 687. Longest Univalue Path
 * https://leetcode.com/problems/longest-univalue-path/description/
 */
public class LongestUnivaluePathTest {
    LongestUnivaluePath longestUnivaluePath = new LongestUnivaluePath();

    @Test
    public void longestUnivaluePath1() {
        TreeNode input = valueOf(new Integer[]{5,4,5,1,1,5}, 0);
        int expected = 2;
        assertEquals(expected, longestUnivaluePath.longestUnivaluePath(input));
    }

    @Test
    public void longestUnivaluePath2() {
        TreeNode input = valueOf(new Integer[]{1,4,5,4,4,5}, 0);
        int expected = 2;
        assertEquals(expected, longestUnivaluePath.longestUnivaluePath(input));
    }

    @Test
    public void longestUnivaluePath3() {
        TreeNode input = valueOf(new Integer[]{1,2,2,2,2,2}, 0);
        int expected = 2;
        assertEquals(expected, longestUnivaluePath.longestUnivaluePath(input));
    }

    @Test
    public void longestUnivaluePath4() {
        TreeNode input = valueOf(new Integer[]{-9,5,0,-2,-6,null,null,5,null,null,-3,6,-5,null,null,null,0}, 0);
        int expected = 0;
        assertEquals(expected, longestUnivaluePath.longestUnivaluePath(input));
    }

    @Test
    public void longestUnivaluePath5() {
        TreeNode input = valueOf(new Integer[]{-6,8,-4,8,-5,-1,null,-9,9,8,8,null,null,-5,6,null,null,null,-4,null,4,null,null,8,8,null,null,null,5,null,null,null,null,null,-9}, 0);
        int expected = 1;
        assertEquals(expected, longestUnivaluePath.longestUnivaluePath(input));
    }

    private TreeNode valueOf(Integer[] array, int index){
        if(index>=array.length || array[index] == null) return null;
        TreeNode root = new TreeNode(array[index]);
        root.left=valueOf(array, index*2+1);
        root.right=valueOf(array, index*2+2);
        return root;
    }
}