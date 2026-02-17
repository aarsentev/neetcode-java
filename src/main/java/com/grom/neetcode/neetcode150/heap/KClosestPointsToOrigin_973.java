package com.grom.neetcode.neetcode150.heap;

import java.util.Arrays;

/**
 * NeetCode 150 - Heap - K Closest Points to Origin (LeetCode #973).
 */
public class KClosestPointsToOrigin_973 {

    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(
                points,
                (a, b) -> (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1])
        );
        return Arrays.copyOfRange(points, 0, k);
    }
}
