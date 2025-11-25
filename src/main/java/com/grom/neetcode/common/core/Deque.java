package main.java.com.grom.neetcode.common.core;

public class Deque {

    class Node {
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    int size;

    public Deque() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void append(int value) {
        if (isEmpty()) {
            head = new Node(value);
            tail = head;
        }
        else{
            tail.next = new Node(value);
            tail.next.prev = tail;
            tail = tail.next;
        }

        size += 1;

    }

    public void appendleft(int value) {
        if (isEmpty()) {
            head = new Node(value);
            tail = head;
        }
        else {
            Node new_head = new Node(value);
            new_head.next = head;
            head.prev = new_head;
            head = new_head;
        }

        size += 1;
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        else {
            int tail_val = tail.val;
            if (size == 1) {
                head = null;
                tail = null;
            }
            else {
                Node new_tail = tail.prev;
                new_tail.next = null;
                tail = new_tail;
            }

            size -= 1;
            return tail_val;
        }
    }

    public int popleft() {
        if (isEmpty()) {
            return -1;
        }
        else {
            int head_val = head.val;
            if (size == 1) {
                head = null;
                tail = null;
            }
            else {
                Node new_head = head.next;
                new_head.prev = null;
                head = new_head;
            }
            size -= 1;
            return head_val;
        }
    }
}
