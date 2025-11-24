package main.java.com.grom.neetcode.neetcode150.two_pointers;

/**
 * NeetCode 150 - Two Pointers - Remove Element (LeetCode #27).
 *
 * Given an integer array nums and an integer val, remove all occurrences of val from nums in-place.
 * After removing all occurrences of val, return the number of remaining elements,
 * k, such that the first k elements of nums do not contain val.
 */
public class RemoveElement_27 {

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
