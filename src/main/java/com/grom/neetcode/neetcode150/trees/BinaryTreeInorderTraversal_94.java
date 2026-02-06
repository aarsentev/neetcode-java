package com.grom.neetcode.neetcode150.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * NeetCode 150 - Trees - Binary Tree Inorder Traversal (LeetCode #94).
 */
public class BinaryTreeInorderTraversal_94 {

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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        if (root == null) {
            return nodes;
        }
        nodes.addAll(inorderTraversal(root.left));
        nodes.add(root.val);
        nodes.addAll(inorderTraversal(root.right));
        return nodes;
    }
}
