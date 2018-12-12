package chapter_1;

/**
 * Problem 1.3
 * Write a method to replace all spaces in a string with '%20'.
 * You may assume that the string has sufficient space at the end to hold the additional characters,
 * and that you are given the "true" length of the string.
 * (Note: If implementing in Java, please use a character array so that you can perform
 * this operation in place.)
 * EXAMPLE
 * Input:   "Mr John Smith    ", 13
 * Output: "Mr%20John%20Smith"
 */
// TODO: 12/12/2018 Alter parameters and fix
class URLify {
    static String replaceSpacesWithValueRepresentation(final String input) {
        if (input.isEmpty() || !input.contains(" ")) return input;
        final char[] inputArray = input.toCharArray();
        final char[] altered = new char[inputArray.length + input.replaceAll("[^ ]+", "").length() * 2];
        System.arraycopy(inputArray, 0, altered, 0, inputArray.length);
        int readPointer = altered.length - 1, writePointer = readPointer;
        boolean coveredTrailingSpace = false;
        while (!coveredTrailingSpace || altered[readPointer] == ' ') {
            if (readPointer != writePointer && altered[readPointer] != ' ') {
                coveredTrailingSpace = true;
                altered[writePointer--] = altered[readPointer];
                altered[readPointer] = ' ';
            }
            readPointer--;
        }
        return new String(altered);
    }
}
