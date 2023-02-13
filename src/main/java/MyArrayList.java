import java.util.Arrays;

public class MyArrayList {
    private Object[] arrayList; //here we store our values
    private int currentLength = 0; //current amount of values in array
    private int size; //how many values we can store
    private int defaultSize = 8; //default size if needed one is unknown for now
    public MyArrayList(int size){
        /**
         * use this constructor if you expect some certain size of your  array
         */
        this.size = size;
        arrayList = new Object[size];
        System.out.println("Array was created");
    }
    public MyArrayList(){
        /**
         * use this constructor if you don't know how much values you'll have
         */
        this.size = defaultSize;
        arrayList = new Object[defaultSize];
        System.out.println("Array was created");
    }
    public void add(Object value){
        if (currentLength+1 > size){ //if we don't have enough space we need to extend our array
            size *= 2;
            arrayList = Arrays.copyOf(arrayList, size);
        }
        arrayList[currentLength] = value;
        currentLength ++;
        System.out.println("New value " + value + " was added, current length = " + currentLength);
    }
    public void remove(int index){
        if (currentLength - 1 >= index){
            Object[] newArray = new Object[currentLength - 1];
            System.arraycopy(arrayList,0,newArray,0,index);
            System.arraycopy(arrayList,index+1,newArray,index,currentLength - index - 1);
            arrayList = newArray;
            currentLength --;
            System.out.println("Value of index " + index + " was removed successfully");
        }
        else throw new IndexOutOfBoundsException();
    }
    public void clear(){
        arrayList = new Object[size];
        currentLength = 0;
        System.out.println("Array was cleared");

    }
    public int size(){
        return currentLength;
    }
    public Object get(int index){
        if (currentLength - 1 >= index) {
            return arrayList[index];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public String toString() {
        return  "myArrayList = " + Arrays.toString(Arrays.copyOfRange(arrayList,0,currentLength));
    }
}
