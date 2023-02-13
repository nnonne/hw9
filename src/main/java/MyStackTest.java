public class MyStackTest {
    public static void main(String[] args) {
        //creating a Queue
        MyStack myStack = new MyStack();
        System.out.println(myStack);

        //adding elements
        System.out.println("\nAdd some elements:");
        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        System.out.println("\nThe size of current stack is " + myStack.size());
        System.out.println(myStack);

        //looking at our first element
        System.out.println("\nThe first element in the stack is " + myStack.peek());
        System.out.println(myStack);
        //deleting first element

        System.out.println("\nDelete first element:");
        myStack.poll();
        System.out.println(myStack);
        myStack.poll();
        System.out.println(myStack);
        myStack.poll();
        System.out.println(myStack);
        System.out.println("The size of current stack is " + myStack.size());

        System.out.println("\nAdd some elements:");
        myStack.push(0);
        myStack.push(1);
        myStack.push(2);

        System.out.println("\nCleaning...");
        myStack.clear();
        System.out.println("The size of current stack is " + myStack.size());

        System.out.println("\nAdd some elements:");
        myStack.push(0);
        myStack.push(1);
        myStack.push(2);

        System.out.println("The size of current stack is " + myStack.size());

        System.out.println("\nRemoving elements from stack:");

        myStack.remove(1);
        System.out.println(myStack);
        System.out.println("The size of current stack is " + myStack.size() + "\n");
        myStack.remove(1);
        System.out.println(myStack);
        System.out.println("The size of current stack is " + myStack.size() + "\n");
        myStack.remove(0);
        System.out.println(myStack);
        System.out.println("The size of current stack is " + myStack.size() + "\n");
        //myStack.remove(1);
    }
}
