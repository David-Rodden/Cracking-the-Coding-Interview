package chapter_4;

import chapter_4.tree_structure.TreeNode;

import java.util.*;

/**
 * Problem 4.3
 * Given a binary tree,
 * design an algorithm which creates a linked list of all the nodes at each depth
 * (e.g., if you have a tree with depth D, you'll have D linked lists).
 */
// TODO: 12/19/2018 Continue findAll implementation through mapping
class ListOfDepths {
    static Map<Integer, Set<Object>> findAll(final TreeNode<Object> observed) {
        // We'll traverse the tree and find every node, assign it to a hash set
        final Map<Integer, Set<Object>> groupedHeights = new HashMap<>();
        groupedHeights.put(0, new HashSet<>());
        groupedHeights.get(0).add(observed.getValue());
        return groupedHeights;
    }
}
