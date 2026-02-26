package com.grom.neetcode.graphs;

/**
 * Count all paths from top-left to bottom-right in a grid with obstacles (1 = blocked, 0 = free),
 * moving in four directions without revisiting cells in the same path.
 */
public class CountPathsInGrid {

    private static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int countPaths(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];

        return dfs(grid, 0, 0, visited);
    }

    private int dfs(int[][] grid, int row, int col, boolean[][] visited) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length
                || grid[row][col] == 1 || visited[row][col]) {
            return 0;
        }
        if (row == grid.length - 1 && col == grid[0].length - 1) {
            return 1;
        }

        visited[row][col] = true;
        int paths = 0;

        for (int[] dir : directions) {
            paths += dfs(grid, row + dir[0], col + dir[1], visited);
        }

        visited[row][col] = false;

        return paths;
    }
}

