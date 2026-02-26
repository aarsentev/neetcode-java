package com.grom.neetcode.neetcode150.graphs;

/**
 * NeetCode 150 - Graphs - Max Area of Island (LeetCode #695).
 */
public class MaxAreaOfIsland_695 {

    private static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int maxAreaOfIsland(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;

        int maxSize = 0;

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (grid[row][col] == 1) {
                    grid[row][col] = dfs(grid, row, col);
                    maxSize = Math.max(grid[row][col], maxSize);
                }
            }
        }
        return maxSize;
    }

    private int dfs(int[][] grid, int row, int col) {
        int size = 1;

        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0) {
            return 0;
        }

        grid[row][col] = 0;

        for (int[] dir : directions) {
            size += dfs(grid, row + dir[0], col + dir[1]);
        }

        return size;
    }
}
