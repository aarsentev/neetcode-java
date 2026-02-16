package com.grom.neetcode.neetcode150.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * NeetCode 150 - Backtracking - Combination Sum (LeetCode #39).
 */
public class CombinationSum_39 {

    private List<List<Integer>> matching_sums;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        matching_sums = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        backtrack(nums, target, current, 0);

        return matching_sums;
    }

    private void backtrack(int[] nums, int target, List<Integer> current, int index) {
        if (target == 0) {
            matching_sums.add(new ArrayList<>(current));
            return;
        }

        if (target < 0 || index >= nums.length) {
            return;
        }

        // Include current element
        current.add(nums[index]);
        backtrack(nums, target - nums[index], current, index);

        // Not include current element
        current.removeLast();
        backtrack(nums, target, current, index + 1);
    }
}
