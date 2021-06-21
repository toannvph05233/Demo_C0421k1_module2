package stackAndQueue;

public class MainQueue {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue();
        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.enqueue(7);
        myQueue.enqueue(9);

        myQueue.show();
        System.out.println();
        System.out.println(myQueue.peek().key);
        System.out.println();
        myQueue.show();
    }
}
