package com.grom.neetcode.graphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Shortest path in a grid with obstacles (1 = blocked, 0 = free),
 * moving in four directions using BFS.
 */
public class ShortestPathInGrid {

    private static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int shortestPath(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;

        boolean[][] hasVisited = new boolean[ROWS][COLS];
        Queue<int[]> queue = new LinkedList<>();
        hasVisited[0][0] = true;
        queue.add(new int[]{0, 0});

        int length = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                int row = cell[0];
                int col = cell[1];

                if (row == ROWS - 1 && col == COLS - 1) {
                    return length;
                }

                for (int[] direction : directions) {
                    int direction_row = direction[0];
                    int direction_col = direction[1];

                    if ((Math.min(row + direction_row, col + direction_col) < 0)
                            || (row + direction_row == ROWS)
                            || (col + direction_col == COLS)
                            || hasVisited[row + direction_row][col + direction_col]
                            || grid[row + direction_row][col + direction_col] == 1) {
                        continue;
                    }
                    queue.add(new int[]{row + direction_row, col + direction_col});
                    hasVisited[row + direction_row][col + direction_col] = true;
                }
            }
            length++;
        }
        return -1;
    }
}

