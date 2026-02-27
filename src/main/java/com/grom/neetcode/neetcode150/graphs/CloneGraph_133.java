package com.grom.neetcode.neetcode150.graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * NeetCode 150 - Graphs - Clone Graph (LeetCode #133).
 */
public class CloneGraph_133 {

    public static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        Map<Node, Node> graph = new HashMap<>();
        Queue<Node> queue = new ArrayDeque<>();

        graph.putIfAbsent(node, new Node(node.val));
        queue.add(node);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            for (Node neighbor : currentNode.neighbors) {
                if (!graph.containsKey(neighbor)) {
                    graph.putIfAbsent(neighbor, new Node(neighbor.val));
                    queue.add(neighbor);
                }

                graph.get(currentNode).neighbors.add(graph.get(neighbor));
            }
        }

        return graph.get(node);
    }
}

