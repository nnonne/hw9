public class MyLinkedListTest {
    public static void main(String[] args) {
        //creating new LinkedList
        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println("The size of current list is " + myLinkedList.size());

        //adding elements
        System.out.println("\nAdd some elements");
        myLinkedList.add(0);
        myLinkedList.add(1);
        System.out.println("The size of current list is " + myLinkedList.size());

        System.out.println(myLinkedList);
        System.out.println("\nCleaning...");
        myLinkedList.clear();
        System.out.println(myLinkedList);
        System.out.println("The size of current list is " + myLinkedList.size());

        System.out.println("\nAdding new elements");
        myLinkedList.add(0);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        System.out.println("The size of current list is " + myLinkedList.size());

        System.out.println("\nTrying to get elements");
        System.out.println("Element of index 0 is " + myLinkedList.get(0));
        System.out.println("Element of index 3 is " + myLinkedList.get(3));
        //System.out.println(myLinkedList.get(4));
        System.out.println("\n" + myLinkedList);

        System.out.println("Removing elements from list:");
        myLinkedList.remove(3);
        System.out.println(myLinkedList);
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
        myLinkedList.remove(0);
        System.out.println("The size of current list is " + myLinkedList.size());

        System.out.println("\nAdding elements again");
        myLinkedList.add(0);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        System.out.println("The size of current list is " + myLinkedList.size());

        System.out.println("\n" + myLinkedList);
    }
}
