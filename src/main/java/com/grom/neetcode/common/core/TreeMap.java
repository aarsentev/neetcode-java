package com.grom.neetcode.common.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary Search Tree-based TreeMap implementation.
 */
public class TreeMap {
    private TreeNode root;

    public TreeMap() {
        root = null;
    }

    public void insert(int key, int val) {
        TreeNode newNode = new TreeNode(key, val);

        if (root == null) {
            this.root = newNode;
            return;
        } else {
            TreeNode currentNode = root;
            while (true) {
                if (newNode.key < currentNode.key) {
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        return;
                    }
                    currentNode = currentNode.left;
                } else if (key > currentNode.key) {
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        return;
                    }
                    currentNode = currentNode.right;
                } else {
                    currentNode.val = val;
                    return;
                }
            }
        }
    }

    public int get(int key) {
        if (root == null) {
            return -1;
        } else {
            TreeNode currentNode = root;
            while (true) {
                if (key < currentNode.key) {
                    if (currentNode.left == null) {
                        return -1;
                    }
                    currentNode = currentNode.left;
                } else if (key > currentNode.key) {
                    if (currentNode.right == null) {
                        return -1;
                    }
                    currentNode = currentNode.right;
                } else {
                    return currentNode.val;
                }
            }
        }
    }

    public int getMin() {
        if (this.root == null) {
            return -1;
        } else {
            TreeNode currentNode = root;
            while (currentNode != null) {
                if (currentNode.left == null) {
                    return currentNode.val;
                } else {
                    currentNode = currentNode.left;
                }
            }
            return -1;
        }
    }

    public int getMax() {
        if (this.root == null) {
            return -1;
        } else {
            TreeNode currentNode = root;
            while (currentNode != null) {
                if (currentNode.right == null) {
                    return currentNode.val;
                } else {
                    currentNode = currentNode.right;
                }
            }
            return -1;
        }
    }

    public void remove(int key) {
        root = removeByKey(root, key);
    }

    private TreeNode findMin(TreeNode node) {
        while (node != null && node.left != null) {
            node = node.left;
        }
        return node;
    }

    private TreeNode removeByKey(TreeNode currentNode, int key) {
        if (currentNode == null) {
            return null;
        }

        if (key > currentNode.key) {
            currentNode.right = removeByKey(currentNode.right, key);
        } else if (key < currentNode.key) {
            currentNode.left = removeByKey(currentNode.left, key);
        } else {
            if (currentNode.left == null) {
                return currentNode.right;
            } else if (currentNode.right == null) {
                return currentNode.left;
            } else {
                TreeNode minNode = findMin(currentNode.right);
                currentNode.key = minNode.key;
                currentNode.val = minNode.val;
                currentNode.right = removeByKey(currentNode.right, minNode.key);
            }
        }
        return currentNode;
    }

    public List<Integer> getInorderKeys() {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);
        return result;
    }

    private void inorderTraversal(TreeNode root, List<Integer> result) {
        if (root != null) {
            inorderTraversal(root.left, result);
            result.add(root.key);
            inorderTraversal(root.right, result);
        }
    }

    private static class TreeNode {
        int key;
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}
