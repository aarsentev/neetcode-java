package com.grom.neetcode.neetcode150.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * NeetCode 150 - Sorting - Merge Sort.
 *
 * Implement Merge Sort.
 */
public class MergeSort {

    public static class Pair {
        public int key;
        public String value;

        public Pair(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public List<Pair> mergeSort(List<Pair> pairs) {
        return mergeSortAlgo(pairs, 0, pairs.size() - 1);
    }

    private List<Pair> mergeSortAlgo(List<Pair> pairs, int start_index, int end_index) {
        if ((end_index - start_index + 1) <= 1) {
            return pairs;
        }
        else {
            int middle_index = (start_index + end_index) / 2;
            mergeSortAlgo(pairs, start_index, middle_index);
            mergeSortAlgo(pairs, (middle_index + 1), end_index);
            merge(pairs, start_index, middle_index, end_index);
            return pairs;
        }
    }

    private void merge(List<Pair> arr, int start, int middle, int end) {
        List<Pair> left_list = new ArrayList<>(arr.subList(start, (middle + 1)));
        List<Pair> right_list = new ArrayList<>(arr.subList((middle + 1), (end + 1)));
        int left_arr_index = 0;
        int right_arr_index = 0;
        int merged_arr_index = start;
        while (left_arr_index < left_list.size() && right_arr_index < right_list.size()) {
            Pair left_item = left_list.get(left_arr_index);
            Pair right_item = right_list.get(right_arr_index);
            if (left_item.key <= right_item.key) {
                arr.set(merged_arr_index, left_item);
                left_arr_index++;
            }
            else {
                arr.set(merged_arr_index, right_item);
                right_arr_index++;
            }
            merged_arr_index++;
        }
        while (left_arr_index < left_list.size()) {
            Pair left_item = left_list.get(left_arr_index);
            arr.set(merged_arr_index, left_item);
            left_arr_index++;
            merged_arr_index++;
        }
        while (right_arr_index < right_list.size()) {
            Pair right_item = right_list.get(right_arr_index);
            arr.set(merged_arr_index, right_item);
            right_arr_index++;
            merged_arr_index++;
        }
    }
}

