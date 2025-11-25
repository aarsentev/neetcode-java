package com.grom.neetcode.neetcode150.linked_list;

/**
 * NeetCode 150 - Linked List - Reverse Linked List (LeetCode #206).
 *
 * Given the beginning of a singly linked list head, reverse the list, and return the new beginning of the list.
 *
 * Example 1:
 * Input: head = [0,1,2,3]
 * Output: [3,2,1,0]
 *
 * Example 2:
 * Input: head = []
 * Output: []
 */
public class ReverseLinkedList_206 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        ListNode current_node = head;
        ListNode previous_node = null;
        while (current_node != null) {
            ListNode next_node = current_node.next;
            current_node.next = previous_node;
            previous_node = current_node;
            current_node = next_node;
        }
        head = previous_node;
        return head;
    }
}

