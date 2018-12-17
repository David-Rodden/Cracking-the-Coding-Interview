package chapter_3;

import java.util.Stack;

/**
 * Problem 3.4
 * Implement a MyQueue class which implements a queue using two stacks.
 */
class QueueViaStacks<T> {
    private final Stack<T> pseudoQueue;

    QueueViaStacks() {
        pseudoQueue = new Stack<>();
    }

    void enqueue(final T element) {
        // If adding a single element to an empty queue,
        // we will always retrieve that same element
        if (pseudoQueue.isEmpty()) {
            pseudoQueue.push(element);
            return;
        }
        // We'll do the heavy lifting through the enqueuing by using another stack
        final Stack<T> holding = new Stack<>();
        // We want our new value to be on the bottom, so we remove all elements to place it there
        while (!pseudoQueue.isEmpty()) holding.push(pseudoQueue.pop());
        pseudoQueue.push(element);
        // Then we are able to push all of our previously popped elements back onto the stack
        while (!holding.isEmpty()) pseudoQueue.push(holding.pop());
    }

    T dequeue() {
        return pseudoQueue.pop();
    }
}
