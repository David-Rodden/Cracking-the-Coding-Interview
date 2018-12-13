package chapter_1;

/**
 * Problem 1.6
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2b1c5a3.
 * If the "compressed" string would not become smaller than the original string,
 * your method should return the original string. You can assume the string has only uppercase and lowercase letters (a-z).
 */
// TODO: 12/12/2018 Add remaining comments to explain counting process
class StringCompression {
    static String compress(final String input) {
        final int inputSize = input.length();
        // Best case aa becomes a2, which is of the same length
        if (inputSize < 3) return input;
        // Use of StringBuilder to construct the newly compressed string
        final StringBuilder compressedInput = new StringBuilder();
        // Iterating through each character in the input to count the characters
        // Use of a head and tail, to tell the size apart, to be displayed in the compressed string
        for (int head = 1, tail = 0; head < inputSize; head++) {
            final char observedHead = input.charAt(head), observedTail = input.charAt(tail);
            if (observedHead == observedTail) {
                if (head != inputSize - 1) continue;
                compressedInput.append(observedTail).append(head - tail + 1);
            }
            compressedInput.append(observedTail).append(head - tail);
            if (head == inputSize - 1)
                compressedInput.append(observedHead).append(1);
            tail = head;
        }
        return compressedInput.length() < inputSize ? compressedInput.toString() : input;

    }

}
