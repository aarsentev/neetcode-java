package com.grom.neetcode.neetcode150.linked_list;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * NeetCode 150 - Linked List - Design Browser History (LeetCode #1472).
 *
 * You have a browser of one tab where you start on the homepage and you can visit another url, get back in the history number of steps or move forward in the history number of steps.
 *
 * Implement the BrowserHistory class:
 * BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
 * void visit(string url) Visits url from the current page. It clears up all the forward history.
 * string back(int steps) Move steps back in history. If you can only return x steps in the history and steps > x, you will return only x steps. Return the current url after moving back in history at most steps.
 * string forward(int steps) Move steps forward in history. If you can only forward x steps in the history and steps > x, you will forward only x steps. Return the current url after forwarding in history at most steps.
 */
public class BrowserHistory_1472 {

    String homepage;
    Deque<String> back_history;
    Deque<String> forward_history;
    String current;

    public BrowserHistory_1472(String homepage) {
        this.homepage = homepage;
        this.current = homepage;
        this.back_history = new ArrayDeque<>();
        this.forward_history = new ArrayDeque<>();
    }

    public void visit(String url) {
        back_history.push(current);
        current = url;
        forward_history.clear();
    }

    public String back(int steps) {
        while (steps > 0 && !back_history.isEmpty()) {
            forward_history.push(current);
            current = back_history.pop();
            steps--;
        }
        if (steps > 0) {
            return this.homepage;
        }
        else {
            return current;
        }
    }

    public String forward(int steps) {
        while (steps > 0 && !forward_history.isEmpty()) {
            back_history.push(current);
            current = forward_history.pop();
            steps--;
        }
        return current;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */

