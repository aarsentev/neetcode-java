package com.grom.neetcode.neetcode150.binary_search;

/**
 * NeetCode 150 - Binary Search - Search a 2D Matrix II (LeetCode #240).
 */
public class SearchA2DMatrixII_240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int col_ind = m - 1;
        while (col_ind >= 0) {
            if (target < matrix[0][col_ind]) {
                col_ind--;
            }
            else if (target > matrix[0][col_ind]){
                if (target < matrix[n - 1][col_ind]) {
                    int start_row = 0;
                    int end_row = n - 1;
                    int mid_row;
                    while (start_row <= end_row) {
                        mid_row = (start_row + end_row) / 2;
                        if (target > matrix[mid_row][col_ind]) {
                            start_row = mid_row + 1;
                        }
                        else if (target < matrix[mid_row][col_ind]) {
                            end_row = mid_row - 1;
                        }
                        else {
                            return true;
                        }
                    }
                    col_ind--;
                }
                else if (target > matrix[n - 1][col_ind]){
                    return false;
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
}
