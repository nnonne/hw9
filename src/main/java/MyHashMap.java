import java.util.Arrays;

public class MyHashMap <K,V>{
    private int size;
    private int currentLength = 0;
    private HashMapNode<K,V>[] buckets;
    public MyHashMap(int size){
        buckets = new HashMapNode[size];
        this.size = size;
        System.out.println("New HashMap was created");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyHashMap)) return false;
        MyHashMap<?, ?> myHashMap = (MyHashMap<?, ?>) o;
        return Arrays.equals(buckets, myHashMap.buckets);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(buckets);
    }

    private  HashMapNode<K,V>[] reHash(HashMapNode<K,V>[] buckets){
        HashMapNode<K,V>[] newBuckets = new HashMapNode[this.size*2];
        this.size *= 2;
        for (HashMapNode bucket: buckets) {
            int index = bucket.getKey().hashCode() % size;
            newBuckets[index] = bucket;
        }
        return newBuckets;
    }
    public void put(K key, V value){
        if (currentLength == size){
            //when there is no more place we double our size and rehash everything
            buckets = reHash(buckets);
        }
        int index = key.hashCode() % size;
        if (buckets[index] == null){
            currentLength++;
        }
        buckets[index] = new HashMapNode(key,value);
        System.out.println("New element was added");
    }
    public void remove(K key){
        buckets[key.hashCode() % size] = null;
        currentLength --;
        System.out.println("Element was removed successfully");
    }
    public void clear(){
        buckets = new HashMapNode[size];
        currentLength = 0;
        System.out.println("The table was cleared");
    }

    @Override
    public String toString() {
        return "MyHashMap{"
                + Arrays.toString(buckets) +
                '}';
    }
    public int size(){
        return currentLength;
    }

    public V get(K key){
        if (buckets[key.hashCode() % size] == null) throw new NullPointerException();
        return buckets[key.hashCode() % size].getValue();
    }
}
