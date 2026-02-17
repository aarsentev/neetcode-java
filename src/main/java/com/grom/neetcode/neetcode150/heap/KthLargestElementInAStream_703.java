package com.grom.neetcode.neetcode150.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * NeetCode 150 - Heap - Kth Largest Element in a Stream (LeetCode #703).
 */
public class KthLargestElementInAStream_703 {

    private final List<Integer> elements;
    private final int k;

    public KthLargestElementInAStream_703(int k, int[] nums) {
        this.elements = new ArrayList<>();
        this.k = k;
        for (int num : nums) {
            this.elements.add(num);
        }
    }

    public int add(int val) {
        elements.add(val);
        Collections.sort(elements);
        return elements.get(elements.size() - k);
    }
}
