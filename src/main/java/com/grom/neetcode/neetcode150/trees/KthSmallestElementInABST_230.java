package com.grom.neetcode.neetcode150.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * NeetCode 150 - Trees - Kth Smallest Element in a BST (LeetCode #230).
 */
public class KthSmallestElementInABST_230 {

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

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> bstNodes = inorderTraversal(root);
        return bstNodes.get(k - 1);
    }

    private List<Integer> inorderTraversal(TreeNode root) {
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
