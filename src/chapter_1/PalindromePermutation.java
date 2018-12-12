package chapter_1;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem 1.4
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters.
 * The palindrome does not need to be limited to just dictionary words.
 * Example:
 * Input - Tact Coa
 * Output - True (permutations: "taco cat", "acto cta", etc.)
 */
class PalindromePermutation {
    static boolean hasMatch(String input) {
        // Remove all whitespace characters as they shouldn't affect the end result in the example
        // Upper & lower case are considered same letter in example
        input = input.replaceAll("\\s+", "").toLowerCase();
        // Creating a map holding each letter & the number of times each shows up
        final Map<Character, Integer> inputMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            final char c = input.charAt(i);
            inputMap.put(c, inputMap.containsKey(c) ? inputMap.get(c) + 1 : 1);
        }
        // Different cases for whether the String is of even or odd length
        // If even, all letters should show up an even amount of times
        // If odd, only one character can show up an odd amount of times, nestled in the center
        final boolean requiresOdd = input.length() % 2 == 1;
        boolean foundOdd = false;
        for (final char c : inputMap.keySet()) {
            final boolean hasOddAmount = inputMap.get(c) % 2 == 1;
            if (!hasOddAmount) continue;
            if (requiresOdd) {
                // Should find only one odd case, then the rest must be even
                if (foundOdd) return false;
                foundOdd = true;
                continue;
            }
            return false;
        }
        return true;
    }
}
