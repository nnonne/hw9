public class HashMapNode<K,V> {
    private HashMapNode<K, V> next;
    private final V value;
    private final K key;

    public void setNext(HashMapNode<K, V> next) {
        this.next = next;
    }

    public HashMapNode<K, V> getNext() {
        return next;
    }

    public V getValue() {
        return value;
    }

    public HashMapNode(K key, V value) {
        this.value = value;
        this.key = key;
    }


    @Override
    public String toString() {
        return "" + key + ": " + value;
    }

    public K getKey() {
        return key;
    }
}