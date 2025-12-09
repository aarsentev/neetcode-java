package com.grom.neetcode.neetcode150.binary_search;

/**
 * NeetCode 150 - Binary Search - Search a 2D Matrix (LeetCode #74).
 */
public class SearchA2DMatrix_74 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 1) {
            return binary_search(matrix[0], target);
        }
        int low_row_ind = 0;
        int top_row_ind = matrix.length - 1;
        int mid_row_ind;
        int col_size = matrix[0].length;
        while (low_row_ind <= top_row_ind) {
            mid_row_ind = (low_row_ind + top_row_ind) / 2;
            if (target < matrix[mid_row_ind][0]) {
                top_row_ind = mid_row_ind - 1;
            }
            else if (target > matrix[mid_row_ind][0]){
                if (target < matrix[mid_row_ind][col_size - 1]) {
                    return binary_search(matrix[mid_row_ind], target);
                }
                else if (target > matrix[mid_row_ind][col_size - 1]){
                    low_row_ind = mid_row_ind + 1;
                }
                else {
                    return true;
                }
            }
            else {
                return true;
            }
        }
        return false;
    }

    private boolean binary_search(int[] row, int target) {
        int start_col = 0;
        int end_col = row.length - 1;
        int mid_col;
        while (start_col <= end_col) {
            mid_col = (start_col + end_col) / 2;
            if (target > row[mid_col]) {
                start_col = mid_col + 1;
            }
            else if (target < row[mid_col]){
                end_col = mid_col - 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
