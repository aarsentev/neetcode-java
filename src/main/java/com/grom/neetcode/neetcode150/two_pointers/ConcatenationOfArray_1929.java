package main.java.com.grom.neetcode.neetcode150.two_pointers;

/**
 * NeetCode 150 - Two Pointers - Concatenation of Array (LeetCode #1929).
 *
 * You are given an integer array nums of length n.
 * Create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * Return the array ans.
 */
public class ConcatenationOfArray_1929 {

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

}
