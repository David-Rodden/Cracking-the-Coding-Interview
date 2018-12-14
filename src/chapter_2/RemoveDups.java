package chapter_2;

import chapter_2.linkedlist_structure.ListNode;

import java.util.*;

/**
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP
 * How would you solve this problem if a temporary buffer is not allowedInteger
 */
class RemoveDups {
    static ListNode removeAll(final ListNode input) {
        final Set<Object> elementSet = new HashSet<>();
        // Add elements to hash set as we progress to find later on if they exist
        ListNode current = input, previous = null;
        while (current != null) {
            final Object currentValue = current.getValue();
            if (!elementSet.contains(currentValue)) {
                elementSet.add(currentValue);
                previous = current;
            } else previous.setNext(current.getNext());
            current = current.getNext();
        }
        // Return the head of the linked list so that it can be read once more
        return input;
    }
}
