package com.grom.neetcode.common.core;

import java.util.ArrayList;

class LinkedList {

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node head;

    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        int node_ind = 0;

        Node current_node = head;

        if (head == null) {
            return -1;
        }

        if (index == 0) {
            return head.val;
        }

        while ((current_node != null) && (node_ind < index)) {
            current_node = current_node.next;
            node_ind += 1;
        }

        if (current_node == null) {
            return -1;
        }
        else {
            return current_node.val;
        }
    }

    public void insertHead(int val) {
        Node new_head = new Node(val);
        new_head.next = head;
        head = new_head;
    }

    public void insertTail(int val) {
        Node current_node = head;

        if (current_node == null) {
            head = new Node(val);
        }
        else {
            while (current_node.next != null) {
                current_node = current_node.next;
            }

            current_node.next = new Node(val);
        }
    }

    public boolean remove(int index) {
        int node_ind = 0;

        Node current_node = head;

        if (head == null) {
            return false;
        }
        else if (index == 0) {
            head = head.next;
            return true;
        }

        while ((current_node != null) && (node_ind < index - 1)) {
            current_node = current_node.next;
            node_ind += 1;
        }

        if (current_node == null) {
            return false;
        }
        else {
            if (current_node.next == null) {
                return false;
            }
            else {
                current_node.next = current_node.next.next;
                return true;
            }
        }
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<Integer>();

        Node current_node = head;
        while (current_node != null) {
            values.add(current_node.val);
            current_node = current_node.next;
        }

        return values;
    }
}


