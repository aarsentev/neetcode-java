package com.grom.neetcode.neetcode150.trees;

/**
 * NeetCode 150 - Trees - Path Sum (LeetCode #112).
 */
public class PathSum_112 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.right == null && root.left == null) {
            return targetSum == root.val;
        }
        if (hasPathSum(root.left, targetSum - root.val)) {
            return true;
        }
        if (hasPathSum(root.right, targetSum - root.val)) {
            return true;
        }
        return false;
    }
}
