public class MyLinkedList<T> {
    private int size = 0;
    private Node<T> head ;  //first element in the list
    private Node<T> tail;  // last element in the list

    public MyLinkedList(){
        head = null;
        tail = null;
        System.out.println("LinkedList was created, current size = " + size);
    }
    public void add(T value){
        Node<T> node = new Node<T>(value);
        if (head == null){
            head = node;
            tail = head;
        }
        else {
            node.setPrevious(tail);
            tail.setNext(node);
            tail = node;
        }
        size++;
        System.out.println("New object was added, current size = " + size);
    }
    public void remove(int index){
        if (size == 0) throw new IndexOutOfBoundsException();
        if (index+1 > size) throw new IndexOutOfBoundsException();
        if (index == 0 ){
            if (size == 1){
                head = null;
                tail = null;
            }
            else{
                head = head.getNext();
                head.setPrevious(null);
            }

        }
        else if (index == size-1){
            tail = tail.getPrevious();
            tail.setNext(null);
        }
        else {
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            Node<T> prev = current.getPrevious();
            Node<T> next = current.getNext();
            prev.setNext(next);
            next.setPrevious(prev);
        }
        size--;
        System.out.println("Item was removed successfully, current size = " + size);
    }
    public void clear(){
        head = null;
        tail = null;
        size = 0;
        System.out.println("List was cleared, current size = " + size);
    }
    public int size(){
        return size;
    }
    public T get(int index){
        if (index + 1 > size){
            throw new IndexOutOfBoundsException();
        }
        else{
            Node<T> current =  head;
            for (int i = 0; i < index; i++){
                current = current.getNext();
            }
            return current.getValue();
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<T> current = head;
        for (int i = 0; i < size; i++){
            builder.append(current.getValue() + " ");
            current = current.getNext();
        }
        return "MyLinkedList{"+ builder.toString().trim() + "}";
    }
}
