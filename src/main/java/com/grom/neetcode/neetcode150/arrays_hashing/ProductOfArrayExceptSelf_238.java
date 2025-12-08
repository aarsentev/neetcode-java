package com.grom.neetcode.neetcode150.arrays_hashing;

/**
 * NeetCode 150 - Arrays & Hashing - Product of Array Except Self (LeetCode #238).
 */
public class ProductOfArrayExceptSelf_238 {

    public int[] productExceptSelf(int[] nums) {
        int[] products = new int[nums.length];
        for (int i = 0; i < products.length; i++) {
            int product = 1;
            for (int j = 0; j < products.length; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }
            products[i] = product;
        }
        return products;
    }
}
