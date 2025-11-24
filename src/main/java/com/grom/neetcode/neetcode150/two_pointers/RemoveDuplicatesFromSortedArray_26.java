package main.java.com.grom.neetcode.neetcode150.two_pointers;

/**
 * NeetCode 150 - Two Pointers - Remove Duplicates From Sorted Array (LeetCode #26).
 *
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once
 * and return the new length k. The first k elements of nums should contain the final result.
 */
public class RemoveDuplicatesFromSortedArray_26 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}


