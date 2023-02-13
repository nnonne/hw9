public class MyHashMapTest {
    public static void main(String[] args) {
        int size = 5;
        MyHashMap myHashMap = new MyHashMap(size);
        myHashMap.put(0,0);
        System.out.println("Current size of our map is " + myHashMap.size());
        System.out.println(myHashMap);
        myHashMap.put(1,1);
        System.out.println(myHashMap);
        myHashMap.put(3,2);
        System.out.println(myHashMap);
        myHashMap.put(7,3);
        System.out.println(myHashMap);
        myHashMap.put(8,4);
        System.out.println(myHashMap);
        System.out.println("Current size of our map is " + myHashMap.size());
        myHashMap.clear();
        System.out.println("Current size of our map is " + myHashMap.size());
        myHashMap.put(0,0);
        System.out.println("Current size of our map is " + myHashMap.size());
        System.out.println(myHashMap);
        myHashMap.put(1,1);
        System.out.println(myHashMap);
        myHashMap.put(3,2);
        System.out.println(myHashMap);
        myHashMap.put(7,3);
        System.out.println(myHashMap);
        myHashMap.put(8,4);
        System.out.println(myHashMap);
        System.out.println("Current size of our map is " + myHashMap.size());
        myHashMap.put(9,5);
        System.out.println(myHashMap);
        myHashMap.put(13,6);
        System.out.println(myHashMap);


        System.out.println(myHashMap.get(0));
        //System.out.println(myHashMap.get(6));
        System.out.println(myHashMap.size());

        myHashMap.remove(0);
        System.out.println(myHashMap);
        System.out.println(myHashMap.size());
    }
}
