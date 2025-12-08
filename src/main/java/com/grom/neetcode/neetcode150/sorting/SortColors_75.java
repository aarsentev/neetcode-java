package com.grom.neetcode.neetcode150.sorting;

/**
 * NeetCode 150 - Sorting - Sort Colors (LeetCode #75).
 */
public class SortColors_75 {

    public void sortColors(int[] nums) {
        int[] counts = {0, 0, 0};
        for (int num: nums) {
            counts[num]++;
        }
        int i = 0;
        for (int n = 0; n < counts.length; n++) {
            for (int j = 0; j < counts[n]; j++ ) {
                nums[i] = n;
                i++;
            }
        }
    }
}
