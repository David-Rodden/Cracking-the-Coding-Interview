package chapter_1;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem 1.2
 * Given two strings, write a method to decide if one is a permutation of the other.
 */
class CheckPermutation {
    static boolean arePermutations(final String first, final String second) {
        final Map<Character, Integer> firstMap = generateMapFromString(first), secondMap = generateMapFromString(second);
        return firstMap.equals(secondMap);
    }

    private static Map<Character, Integer> generateMapFromString(final String input) {
        final Map<Character, Integer> mapping = new HashMap<>();
        for (final char c : input.toCharArray())
            mapping.put(c, mapping.containsKey(c) ? mapping.get(c) + 1 : 1);
        return mapping;
    }
}
