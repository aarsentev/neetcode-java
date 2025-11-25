package com.grom.neetcode.neetcode150.linked_list;

/**
 * NeetCode 150 - Linked List - Linked List Cycle (LeetCode #141).
 *
 * Given the beginning of a linked list head, return true if there is a cycle in the linked list. Otherwise, return false.
 *
 * There is a cycle in a linked list if at least one node in the list can be visited again by following the next pointer.
 *
 * Internally, index determines the index of the beginning of the cycle, if it exists. The tail node of the list will set it's next pointer to the index-th node. If index = -1, then the tail node points to null and no cycle exists.
 */
public class LinkedListCycle_141 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}

