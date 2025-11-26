package com.grom.neetcode.neetcode150.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * NeetCode 150 - Sorting - Insertion Sort.
 *
 * Implement Insertion Sort and return intermediate states.
 */
public class InsertionSort {

    public static class Pair {
        int key;
        String value;

        Pair(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> steps = new ArrayList<List<Pair>>();
        if (pairs.isEmpty()) {
            return steps;
        }
        steps.add(new ArrayList<>(pairs));
        for (int i = 1; i < pairs.size(); i++) {
            int j = i - 1;
            while(j >= 0 && pairs.get(j + 1).key < pairs.get(j).key) {
                Pair temp = pairs.get(j + 1);
                pairs.set(j + 1, pairs.get(j));
                pairs.set(j, temp);
                j--;
            }
            steps.add(new ArrayList<>(pairs));
        }
        return steps;
    }
}

