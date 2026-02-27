package com.grom.neetcode.neetcode150.graphs;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * NeetCode 150 - Graphs - Rotting Oranges (LeetCode #994).
 */
public class RottingOranges_994 {

    private static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int orangesRotting(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;

        Queue<int[]> queue = new ArrayDeque<>();
        int time = 0;
        int fresh = 0;

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (grid[row][col] == 1) {
                    fresh++;
                }
                if (grid[row][col] == 2) {
                    queue.offer(new int[]{row, col});
                }
            }
        }

        while (fresh > 0 && !queue.isEmpty()) {
            int length = queue.size();

            for (int i = 0; i < length; i++) {
                int[] cell = queue.poll();
                int cell_row = cell[0];
                int cell_col = cell[1];

                for (int[] direction : directions) {
                    int row_direction = cell_row + direction[0];
                    int col_direction = cell_col + direction[1];

                    if (row_direction >= 0 && col_direction >= 0
                            && row_direction < ROWS && col_direction < COLS
                            && grid[row_direction][col_direction] == 1) {
                        grid[row_direction][col_direction] = 2;
                        queue.offer(new int[]{row_direction, col_direction});
                        fresh--;
                    }
                }
            }
            time++;
        }
        return (fresh == 0) ? time : -1;
    }
}

