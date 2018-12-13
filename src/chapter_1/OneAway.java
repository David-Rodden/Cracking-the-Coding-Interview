package chapter_1;

/**
 * Problem 1.5
 * There are three types of edits that can be performed on strings:
 * insert a character, remove a character, or replace a character.
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 * EXAMPLE
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 */
// TODO: 12/12/2018 Make sure it looks through, reformatting of continues
class OneAway {
    static boolean isOneApart(final String first, final String second) {
        // Base case, where both strings are identical
        if (first.equals(second)) return true;
        final int firstLength = first.length(), secondLength = second.length();
        // Maximum acceptable difference in string sizes is 1
        if (Math.abs(firstLength - secondLength) > 1) return false;
        // If both are of equal length, check for replacement case
        int i = -1, j = -1;
        while (i++ < firstLength && j++ < secondLength) {
            final char observedFirst = first.charAt(i), observedSecond = second.charAt(j);
            System.out.println("Looking at " + observedFirst + " and " + observedSecond);
            if (observedFirst == observedSecond) continue;
            if ((i + 1) < firstLength)
                if (first.charAt(i + 1) == observedSecond) {
                    j++;
                    continue;
                }
            if ((j + 1) < secondLength)
                if (observedFirst == second.charAt(j + 1)) {
                    i++;
                    continue;
                }
            if (i < j) {
                i++;
                continue;
            }
            if (j < i) {
                j++;
                continue;
            }
            return false;
        }
        return true;
    }

}
