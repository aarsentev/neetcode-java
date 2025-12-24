package com.grom.neetcode.neetcode150.trees;

/**
 * NeetCode 150 - Trees - Delete Node in a BST (LeetCode #450).
 */
public class DeleteNodeInABST_450 {

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

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }
        else {
            if (root.right == null) {
                return root.left;
            }
            else if (root.left == null) {
                return root.right;
            }
            else {
                TreeNode current_root = root.right;
                while (current_root.left != null) {
                    current_root = current_root.left;
                }
                root.val = current_root.val;
                root.right = deleteNode(root.right, current_root.val);
            }
        }
        return root;
    }
}
