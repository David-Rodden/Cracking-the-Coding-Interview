package chapter_2;

import chapter_2.linkedlist_structure.ListNode;

public class TestingGrounds {
    public static void main(String[] args) {
        final ListNode<String> head = new ListNode<>("John");
        ListNode observed = head;
        observed.setNext(new ListNode<>("Fred"));
        observed = observed.getNext();
        observed.setNext(new ListNode<>("Jack"));
        observed = DeleteMiddleNode.removeAnyMiddle(head);
        while (observed != null) {
            System.out.println(observed.getValue());
            observed = observed.getNext();
        }
    }
}
