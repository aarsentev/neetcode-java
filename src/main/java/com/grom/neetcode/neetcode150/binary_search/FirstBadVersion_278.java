package com.grom.neetcode.neetcode150.binary_search;

/**
 * NeetCode 150 - Binary Search - First Bad Version (LeetCode #278).
 *
 * The isBadVersion API is defined in the parent class VersionControl.
 * boolean isBadVersion(int version);
 */
public class FirstBadVersion_278 {

    // Placeholder for LeetCode's VersionControl API
    boolean isBadVersion(int version) { return false; }

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid = 0;
        boolean res;
        while (start <= end) {
            mid = start + (end - start) / 2;
            res = isBadVersion(mid);
            if (res) {
                if (isBadVersion(mid - 1)) {
                    end = mid - 1;
                }
                else {
                    return mid;
                }
            }
            else {
                start = mid + 1;
            }
        }
        return mid;
    }
}
