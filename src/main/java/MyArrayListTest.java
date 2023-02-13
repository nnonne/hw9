public class MyArrayListTest {
    public static void main(String[] args) {
        int size = 5; //setting the size of our array

        MyArrayList myArrayList = new MyArrayList(size); // creating array

        //adding 5 elements
        System.out.println("\nNow we add 5 elements to our array");
        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);

        //checking the size
        System.out.println("\nThe size of current array is " + myArrayList.size());

        //adding one extra element to check if extending works
        System.out.println("\nAdding extra element");
        myArrayList.add(5);

        //checking new size
        System.out.println("\nThe size of current array is " + myArrayList.size());

        //checking if we can get elements from our array
        System.out.println("\nGetting element of index 2");
        System.out.println("The element of index 2 in our array is " + myArrayList.get(2));
        System.out.println("\nCleaning...");
        myArrayList.clear(); //clearing our array
        //checking if the size of array changes after cleaning
        System.out.println("The size of current array is " + myArrayList.size());
        System.out.println("\nAdding 5 elements again");
        //adding 5 elements to array
        myArrayList.add(0);
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);

        //checking if the size changes after cleaning and adding elements
        System.out.println("The size of current array is " + myArrayList.size());

        //trying to get elements which doesn't exist
//        System.out.println("\nTrying to get more elements");
//        myArrayList.get(5);
//        myArrayList.get(100);

        System.out.println("\n");
        //checking how toString() works
        System.out.println(myArrayList);
        //removing element
        System.out.println("\nRemoving elements...");
        myArrayList.remove(1);

        //checking the size and elements in array
        System.out.println(myArrayList);
        System.out.println("The size of current array is " + myArrayList.size());

        myArrayList.remove(1);

        //checking the size and elements in array
        System.out.println(myArrayList);
        System.out.println("The size of current array is " + myArrayList.size());

        //trying to remove element that doesn't exist
//        System.out.println("\nRemoving element that doesn't exist");
//        myArrayList.remove(10);
    }
}
