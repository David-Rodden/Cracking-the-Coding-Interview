package chapter_2;

import chapter_2.linkedlist_structure.ListNode;

/**
 * Implement an algorithm to find the kth to last element of a singly linked list.
 */
class ReturnKthToLast {
    static ListNode get(ListNode input, int index) {
        // First, we need to know the size of the given linked list
        final int size = getSize(input);
        // The first element in the linked list would be k - 1 from last, given its size, k
        if (index >= size || index < 0) return null;
        for (; index < size - 1; index++)
            input = input.getNext();
        return input;
    }

    private static int getSize(ListNode inputPointer) {
        int size = 0;
        while (inputPointer != null) {
            inputPointer = inputPointer.getNext();
            size++;
        }
        return size;
    }
}
