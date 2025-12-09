package com.grom.neetcode.neetcode150.arrays_hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * NeetCode 150 - Arrays & Hashing - Longest Substring Without Repeating Characters (LeetCode #3).
 */
public class LongestSubstringWithoutRepeatingCharacters_3 {

    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            Set<Character> charSet = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (charSet.contains(s.charAt(j))) {
                    break;
                }
                else {
                    charSet.add(s.charAt(j));
                }
            }
            if (charSet.size() > res) {
                res = charSet.size();
            }
        }
        return res;
    }
}
