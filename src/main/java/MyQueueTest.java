public class MyQueueTest {
    public static void main(String[] args) {
        //creating a Queue
        MyQueue myQueue = new MyQueue();
        System.out.println(myQueue);

        //adding elements
        System.out.println("\nAdd some elements:");
        myQueue.add(0);
        myQueue.add(1);
        myQueue.add(2);
        System.out.println("\nThe size of current queue is " + myQueue.size());
        System.out.println(myQueue);

        //looking at our first element
        System.out.println("\nThe first element in the queue is " + myQueue.peek());
        System.out.println(myQueue);
        //deleting first element

        System.out.println("\nDelete first element:");
        myQueue.poll();
        System.out.println(myQueue);
        myQueue.poll();
        System.out.println(myQueue);
        myQueue.poll();
        System.out.println(myQueue);
        System.out.println("The size of current queue is " + myQueue.size());

        System.out.println("\nAdd some elements:");
        myQueue.add(0);
        myQueue.add(1);
        myQueue.add(2);

        System.out.println("\nCleaning...");
        myQueue.clear();
        System.out.println("The size of current queue is " + myQueue.size());
    }
}
