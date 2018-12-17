package chapter_3;

import java.util.Arrays;
import java.util.Stack;

public class TestingGrounds {
    public static void main(String[] args) {
        final Stack<Integer> unsortedValues = new Stack<>();
        unsortedValues.addAll(Arrays.asList(5, 10, 12, 8, 3, 1));
        System.out.println(SortStack.sort(unsortedValues).peek());
    }
}
