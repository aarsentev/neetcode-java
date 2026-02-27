package com.grom.neetcode.neetcode150.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * NeetCode 150 - Graphs - Course Schedule (LeetCode #207).
 */
public class CourseSchedule_207 {

    private final Map<Integer, List<Integer>> prereqMap = new HashMap<>();
    private final Set<Integer> visiting = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < numCourses; i++) {
            prereqMap.put(i, new ArrayList<>());
        }
        for (int[] prereq : prerequisites) {
            prereqMap.get(prereq[0]).add(prereq[1]);
        }

        for (int course = 0; course < numCourses; course++) {
            if (!dfs(course)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int course) {
        if (visiting.contains(course)) {
            return false;
        }
        if (prereqMap.get(course).isEmpty()) {
            return true;
        }

        visiting.add(course);
        for (int prereq : prereqMap.get(course)) {
            if (!dfs(prereq)) {
                return false;
            }
        }
        visiting.remove(course);
        prereqMap.put(course, new ArrayList<>());
        return true;
    }
}

