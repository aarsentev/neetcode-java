package com.grom.neetcode.neetcode150.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * NeetCode 150 - Heap - Last Stone Weight (LeetCode #1046).
 */
public class LastStoneWeight_1046 {

    public int lastStoneWeight(int[] stones) {
        List<Integer> stonesList = new ArrayList<>();
        for (int stone : stones) {
            stonesList.add(stone);
        }

        while (stonesList.size() > 1) {
            Collections.sort(stonesList);
            int biggestStone = stonesList.removeLast();
            int secondBiggestStone = stonesList.removeLast();

            int stoneDifference = biggestStone - secondBiggestStone;

            if (stoneDifference != 0) {
                stonesList.add(stoneDifference);
            }
        }

        if (stonesList.size() == 0) {
            return 0;
        } else {
            return stonesList.get(0);
        }
    }
}
