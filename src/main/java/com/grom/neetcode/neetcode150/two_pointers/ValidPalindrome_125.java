package com.grom.neetcode.neetcode150.two_pointers;

/**
 * NeetCode 150 - Two Pointers - Valid Palindrome (LeetCode #125).
 */
public class ValidPalindrome_125 {

    public boolean isPalindrome(String s) {
        String cleanS = "";
        for (char c: s.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanS += c;
            }
        }
        String reverse = "";
        for(int i = (cleanS.length() - 1); i >= 0; i--) {
            reverse += cleanS.charAt(i);
        }
        return cleanS.equals(reverse);
    }
}
