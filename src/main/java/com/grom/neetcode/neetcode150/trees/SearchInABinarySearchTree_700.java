package com.grom.neetcode.neetcode150.trees;

/**
 * NeetCode 150 - Trees - Search in a Binary Search Tree (LeetCode #700).
 */
public class SearchInABinarySearchTree_700 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode current_tree_root = new TreeNode();
        if (root == null) {
            return null;
        }
        if (val > root.val) {
            current_tree_root = root.right;
            return searchBST(current_tree_root, val);
        }
        else if (val < root.val) {
            current_tree_root = root.left;
            return searchBST(current_tree_root, val);
        }
        else {
            return root;
        }
    }
}
