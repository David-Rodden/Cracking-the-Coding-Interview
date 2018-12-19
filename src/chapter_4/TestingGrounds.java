package chapter_4;

import chapter_4.tree_structure.TreeNode;

public class TestingGrounds {
    public static void main(String[] args) {
        final TreeNode head = MinimalTree.constructBinaryTree(new int[]{2, 3, 5, 8, 12});
        printChildren(head);
    }

    private static void printChildren(final TreeNode observed) {
        if(observed == null)    return;
        printChildren(observed.getLeft());
        System.out.println(observed.getValue());
        printChildren(observed.getRight());
    }
}
