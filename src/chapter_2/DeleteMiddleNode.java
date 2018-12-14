package chapter_2;

import chapter_2.linkedlist_structure.ListNode;

/**
 * Problem 2.3
 * Implement an algorithm to delete a node in the middle
 * (i.e., any node but the first and last node, not necessarily the exact middle)
 * of a singly linked list, given only access to that node.
 * EXAMPLE
 * Input: the node c from the linked list a -> b -> c -> d -> e -> f
 * Result: nothing is returned but the new linked list looks like a -> b -> d -> e -> f
 */
class DeleteMiddleNode {
    static ListNode removeAnyMiddle(final ListNode input) {
        // Make sure the size of the list is greater than 2 so that a middle zone exists
        final int size = getSize(input);
        if (size > 2) input.setNext(input.getNext().getNext());
        return input;
    }

    private static int getSize(ListNode inputPointer) {
        int size = 0;
        for (; inputPointer != null; size++)
            inputPointer = inputPointer.getNext();
        return size;
    }
}
