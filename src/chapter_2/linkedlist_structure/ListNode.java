package chapter_2.linkedlist_structure;

public class ListNode<T> {
    private final T value;
    private ListNode next;

    public ListNode(final T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(final ListNode next) {
        this.next = next;
    }
}
