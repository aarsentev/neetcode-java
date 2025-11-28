package com.grom.neetcode.neetcode150.sorting;

import java.util.List;

/**
 * NeetCode 150 - Sorting - Quick Sort.
 *
 * Implement Quick Sort.
 */
public class QuickSort {

    public static class Pair {
        int key;
        String value;

        public Pair(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public List<Pair> quickSort(List<Pair> pairs) {
        return quickSortAlgo(pairs, 0, pairs.size() - 1);
    }

    private List<Pair> quickSortAlgo(List<Pair> pairs, int start_index, int end_index) {
        if ((end_index - start_index + 1) <= 1) {
            return pairs;
        }
        Pair pivot = pairs.get(end_index);
        int left = start_index;
        for (int i = start_index; i < end_index; i++) {
            if (pairs.get(i).key < pivot.key) {
                Pair temp = pairs.get(left);
                pairs.set(left, pairs.get(i));
                pairs.set(i, temp);
                left++;
            }
        }
        pairs.set(end_index, pairs.get(left));
        pairs.set(left, pivot);
        quickSortAlgo(pairs, start_index, left - 1);
        quickSortAlgo(pairs, left + 1, end_index);
        return pairs;
    }
}
