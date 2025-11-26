package com.grom.neetcode.neetcode150.dynamic_programming;

/**
 * NeetCode 150 - Dynamic Programming - Climbing Stairs (LeetCode #70).
 *
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs_70 {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] cache = new int[n + 1];
        cache[0] = 0;
        cache[1] = 1;
        cache[2] = 2;
        for (int i = 3; i <= n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n];
    }
}

