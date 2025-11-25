package main.java.com.grom.neetcode.neetcode150.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * NeetCode 150 - Stacks - Valid Parentheses (LeetCode #20).
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 * 1) Open brackets must be closed by the same type of brackets.
 * 2) Open brackets must be closed in the correct order.
 * 3) Every close bracket has a corresponding open bracket of the same type.
 *
 */
public class Valid_Parentheses_20 {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c: s.toCharArray()) {
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char stackTop = stack.pop();

                if (c == ']' && stackTop != '['){
                    return false;
                }
                else if  (c == '}' && stackTop != '{') {
                    return false;
                }
                else if (c == ')' && stackTop != '(') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
