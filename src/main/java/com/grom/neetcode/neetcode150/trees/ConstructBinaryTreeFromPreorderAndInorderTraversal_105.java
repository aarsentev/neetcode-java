package com.grom.neetcode.neetcode150.trees;

import java.util.Arrays;

/**
 * NeetCode 150 - Trees - Construct Binary Tree from Preorder and Inorder Traversal (LeetCode #105).
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal_105 {

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

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);

        int root_index = -1;
        for (int k = 0; k < inorder.length; k++) {
            if (inorder[k] == preorder[0]) {
                root_index = k;
                break;
            }
        }

        int[] leftPreorder = Arrays.copyOfRange(preorder, 1, root_index + 1);
        int[] leftInorder = Arrays.copyOfRange(inorder, 0, root_index);
        root.left = buildTree(leftPreorder, leftInorder);

        int[] rightPreorder = Arrays.copyOfRange(preorder, root_index + 1, preorder.length);
        int[] rightInorder = Arrays.copyOfRange(inorder, root_index + 1, inorder.length);
        root.right = buildTree(rightPreorder, rightInorder);

        return root;
    }
}
