package com.grom.neetcode.neetcode150.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * NeetCode 150 - Backtracking - Subsets (LeetCode #78).
 */
public class Subsets_78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(nums, 0, subset, combinations);
        return combinations;
    }

    private void dfs(int[] nums, int index, List<Integer> subset, List<List<Integer>> combinations) {
        if (index >= nums.length) {
            combinations.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        dfs(nums, index + 1, subset, combinations);

        subset.remove(subset.size() - 1);
        dfs(nums, index + 1, subset, combinations);
    }
}
