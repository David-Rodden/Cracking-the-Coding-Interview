package chapter_4;

import chapter_4.tree_structure.TreeNode;

/**
 * Problem 4.2
 * Given a sorted (increasing order) array with unique integer elements,
 * write an algorithm to create a binary search tree with minimal height
 */
class MinimalTree {
    static TreeNode constructBinaryTree(final int[] sortedValues) {
        return addNodes(sortedValues, 0, sortedValues.length - 1);
    }

    private static TreeNode addNodes(final int[] sortedValues, final int start, final int end) {
        // Start should not pass end when adding children
        if (start > end) return null;
        // Find the midpoint between a given start & end so that we can recursively find the middle
        // This will be optimal when minimizing the depth of the constructed tree
        final int midpoint = (start + end) / 2;
        final TreeNode observed = new TreeNode<>(sortedValues[midpoint]);
        observed.setLeft(addNodes(sortedValues, start, midpoint - 1));
        observed.setRight(addNodes(sortedValues, midpoint + 1, end));
        // Returns the constructed tree's head
        return observed;
    }
}
