package com.grom.neetcode.neetcode150.binary_search;

/**
 * NeetCode 150 - Binary Search - Guess Number Higher or Lower (LeetCode #374).
 *
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return       -1 if num is higher than the picked number
 *                1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
public class GuessNumberHigherOrLower_374 {

    // Placeholder for LeetCode's GuessGame API
    int guess(int num) { return 0; }

    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        int mid;
        int res;
        while (start <= end) {
            mid = start + (end - start) / 2;
            res = guess(mid);
            if (res == 1) {
                start = mid + 1;
            }
            else if (res == -1) {
                end = mid - 1;
            }
            else if (res == 0) {
                return mid;
            }
        }
        return 0;
    }
}
