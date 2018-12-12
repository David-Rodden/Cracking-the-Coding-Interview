package chapter_1;

import java.util.Arrays;

/**
 * Problem 1.1
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */
class IsUnique {
    static boolean hasUniqueCharacters(final String input) {
        final char[] inputArray = input.toCharArray();
        Arrays.sort(inputArray);
        for (int i = 0; i < inputArray.length - 1; i++)
            if (inputArray[i] == inputArray[i + 1]) return false;
        return true;
    }
}
