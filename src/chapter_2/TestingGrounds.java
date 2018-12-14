package chapter_2;

import chapter_2.linkedlist_structure.ListNode;

public class TestingGrounds {
    public static void main(String[] args) {
        final ListNode<Integer> head = new ListNode<>(3);
        ListNode observed = head;
        observed.setNext(new ListNode<>(3));
        observed = observed.getNext();
        observed.setNext(new ListNode<>(4));
        observed = observed.getNext();
        observed.setNext(new ListNode<>(3));
        observed = observed.getNext();
        observed.setNext(new ListNode<>(4));
        observed = observed.getNext();
        observed = RemoveDups.removeAll(head);
        while (observed != null) {
            System.out.println(observed.getValue());
            observed = observed.getNext();
        }
    }
}
