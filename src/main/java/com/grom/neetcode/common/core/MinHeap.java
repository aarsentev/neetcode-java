package com.grom.neetcode.common.core;

import java.util.ArrayList;
import java.util.List;

/**
 * Min-heap implementation (1-based index, root at index 1).
 */
public class MinHeap {

    private List<Integer> heap;

    public MinHeap() {
        this.heap = new ArrayList<>();
        this.heap.add(0);
    }

    public void push(int val) {
        this.heap.add(val);
        this.bubbleUp(heap.size() - 1);
    }

    public int pop() {
        if (this.heap.size() <= 1) {
            return -1;
        }
        if (this.heap.size() == 2) {
            return this.heap.removeLast();
        }

        int root = this.heap.get(1);
        this.heap.set(1, this.heap.removeLast());

        if (heap.size() > 1) {
            this.bubbleDown(1);
        }
        return root;
    }

    public int top() {
        if (this.heap.size() > 1) {
            return this.heap.get(1);
        } else {
            return -1;
        }
    }

    public void heapify(List<Integer> nums) {
        this.heap = new ArrayList<>();
        this.heap.add(0);
        this.heap.addAll(nums);
        for (int k = this.heap.size() / 2; k >= 1; k--) {
            this.bubbleDown(k);
        }
    }

    private void bubbleUp(int index) {
        int parent = index / 2;
        while (index > 1 && this.heap.get(index) < this.heap.get(parent)) {
            swap(index, parent);
            index = parent;
            parent = index / 2;
        }
    }

    private void bubbleDown(int index) {
        int child = 2 * index;
        while (child < this.heap.size()) {
            if ((child + 1) < this.heap.size() && this.heap.get(child) > this.heap.get(child + 1)) {
                child += 1;
            }

            if (this.heap.get(child) >= this.heap.get(index)) {
                break;
            }
            swap(index, child);
            index = child;
            child = 2 * index;
        }
    }

    private void swap(int indexOne, int indexTwo) {
        int temp = this.heap.get(indexOne);
        this.heap.set(indexOne, this.heap.get(indexTwo));
        this.heap.set(indexTwo, temp);
    }
}
