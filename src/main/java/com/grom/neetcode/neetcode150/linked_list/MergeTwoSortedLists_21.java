package com.grom.neetcode.neetcode150.linked_list;

/**
 * NeetCode 150 - Linked List - Merge Two Sorted Lists (LeetCode #21).
 *
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 */
public class MergeTwoSortedLists_21 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode current_node1 = list1;
        ListNode current_node2 = list2;
        ListNode new_head = null;
        ListNode new_current_node = null;
        while (current_node1 != null && current_node2 != null) {
            ListNode placeholder_node = null;
            if (current_node1.val <= current_node2.val) {
                placeholder_node = current_node1;
                current_node1 = current_node1.next;
            }
            else {
                placeholder_node = current_node2;
                current_node2 = current_node2.next;
            }
            if (new_head == null) {
                new_head = placeholder_node;
                new_current_node = placeholder_node;
            }
            else {
                new_current_node.next = placeholder_node;
                new_current_node = new_current_node.next;
            }
        }
        if (current_node1 != null) {
            new_current_node.next = current_node1;
        }
        else if (current_node2 != null) {
            new_current_node.next = current_node2;
        }
        return new_head;
    }
}

