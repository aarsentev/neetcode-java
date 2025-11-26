package com.grom.neetcode.neetcode150.linked_list;

/**
 * NeetCode 150 - Linked List - Insertion Sort List (LeetCode #147).
 *
 * Given the head of a singly linked list, sort the list using insertion sort, and return the sorted list's head.
 *
 * The steps of the insertion sort algorithm:
 * Insertion sort iterates, consuming one input element each repetition and growing a sorted output list.
 * At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list and inserts it there.
 * It repeats until no input elements remain.
 */
public class InsertionSortList_147 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode insertionSortList(ListNode head) {
        ListNode placeholder_head = new ListNode(0);
        ListNode current_node = head;
        ListNode previous_node = placeholder_head;
        while (current_node != null) {
            while (previous_node.next != null && previous_node.next.val < current_node.val) {
                previous_node = previous_node.next;
            }
            ListNode next = current_node.next;
            current_node.next = previous_node.next;
            previous_node.next = current_node;
            current_node = next;
            previous_node = placeholder_head;
        }
        return placeholder_head.next;
    }
}

