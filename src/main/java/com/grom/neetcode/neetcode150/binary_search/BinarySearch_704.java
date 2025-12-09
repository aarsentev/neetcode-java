package com.grom.neetcode.neetcode150.binary_search;

/**
 * NeetCode 150 - Binary Search - Binary Search (LeetCode #704).
 */
public class BinarySearch_704 {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (target > nums[mid]) {
                left = mid + 1;
            }
            else if (target < nums[mid]) {
                right = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
