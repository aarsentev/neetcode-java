package com.grom.neetcode.neetcode150.binary_search;

/**
 * NeetCode 150 - Binary Search - Koko Eating Bananas (LeetCode #875).
 */
public class KokoEatingBananas_875 {

    public int minEatingSpeed(int[] piles, int h) {
        int max_pile = 0;
        for (int pile: piles) {
            if (pile > max_pile) {
                max_pile = pile;
            }
        }
        int left = 1;
        int right = max_pile;
        int speed = right;
        while (left <= right) {
            int mid = (left + right) / 2;
            long total_time = 0;
            for(int pile: piles) {
                total_time += Math.ceil((double) pile / mid);
            }
            if (total_time <= h) {
                speed = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return speed;
    }
}
