package chapter_3;

import java.util.Stack;

/**
 * Problem 3.5
 * Write a program to sort a stack such that the smallest items are on the top.
 * You can use an additional temporary stack, but you may not copy the elements into any other data structure
 * (such as an array).
 * The stack supports the following operations: push, pop, peek, and isEmpty
 */
class SortStack {
    static Stack<Integer> sort(final Stack<Integer> unsortedStack) {
        // Create a new stack that will contain the sorted values
        final Stack<Integer> sortedStack = new Stack<>();
        while (!unsortedStack.isEmpty()) {
            // Remove an element from the unsorted list to compare to the sorted elements
            final int observed = unsortedStack.pop();
            // Keep removing all elements within the sorted list until an element we find
            // is less than our observed value, so that it stays sorted
            while (!sortedStack.isEmpty() && observed < sortedStack.peek())
                unsortedStack.push(sortedStack.pop());
            sortedStack.push(observed);
        }
        return sortedStack;
    }
}
