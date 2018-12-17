package chapter_3;

public class TestingGrounds {
    public static void main(String[] args) {
        final QueueViaStacks<String> myQueue = new QueueViaStacks<>();
        myQueue.enqueue("John");
        myQueue.enqueue("Jose");
        System.out.println(myQueue.dequeue() + ", " + myQueue.dequeue());
    }
}
