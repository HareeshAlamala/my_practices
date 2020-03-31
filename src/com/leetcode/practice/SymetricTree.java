package com.leetcode.practice;

public class SymetricTree {

    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean isSymmetric(TreeNode root) {
        return checkSymmetry(root,root);
    }

    public boolean checkSymmetry(TreeNode left, TreeNode right) {

        if (left == null && right == null)
            return true;

        if (left != null && right != null && left.val == right.val)
            return checkSymmetry(left.left,right.right) && checkSymmetry(left.right,right.left);

        return false;
    }
}
