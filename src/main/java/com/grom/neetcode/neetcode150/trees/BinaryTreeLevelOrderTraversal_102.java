package com.grom.neetcode.neetcode150.trees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * NeetCode 150 - Trees - Binary Tree Level Order Traversal (LeetCode #102).
 */
public class BinaryTreeLevelOrderTraversal_102 {

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

    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> levels = new ArrayList<>();

        if (root != null) {
            queue.add(root);
        }

        while (!queue.isEmpty()) {
            int levelLength = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < levelLength; i++) {
                TreeNode curr = queue.removeFirst();
                level.add(curr.val);
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            levels.add(level);
        }
        return levels;
    }
}
