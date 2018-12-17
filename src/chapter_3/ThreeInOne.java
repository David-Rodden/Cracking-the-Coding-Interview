package chapter_3;

/**
 * Problem 3.1
 * Describe how you could use a single array to implement three stacks.
 */
// TODO: 12/16/2018 Finish push & pop issues
class ThreeInOne {


    private enum StackIdentifier {
        FIRST(1), SECOND(2), THIRD(3);

        private final int value;

        StackIdentifier(final int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private final int[] stack;
    private final int capacity;
    private int firstPointer, secondPointer, thirdPointer;

    ThreeInOne(final int capacity) {
        // Divide the array into three equal parts allocated for each "stack"
        this.capacity = capacity;
        firstPointer = 0;
        secondPointer = capacity;
        thirdPointer = secondPointer + capacity;
        this.stack = new int[capacity * 3];
    }

    void push(final int value, final StackIdentifier identifier) {
        if (identifier == null) return;
        final int pointer = identifier.getValue() * capacity, maxPointer = pointer + capacity - 1;

    }

    int pop(final StackIdentifier identifier) {
        return 0;
    }

    public static void main(String[] args) {
        new ThreeInOne(4);
    }
}