public class MyQueue <Q >{
    private int size = 0;
    private Node<Q> head ;  //first element in the queue
    private Node<Q> tail;  // last element in the queue

    public MyQueue(){
        head = null;
        tail = null;
        System.out.println("Queue was created, current size = " + size);
    }

    public void add(Q value){
        Node<Q> node = new Node<Q>(value);
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

    public void clear(){
        head = null;
        tail = null;
        size = 0;
        System.out.println("Queue was cleared");

    }
    public int size(){
        return size;
    }
    public Q poll() {
        if (size == 0) throw new NullPointerException();
        Node<Q> ans = head;
        if (size == 1){
            head = null;
            tail = null;
        }
        else{
            head = head.getNext();
            head.setPrevious(null);
        }
        size--;
        return ans.getValue();
    }
    public Q peek(){
        if (size == 0) throw new NullPointerException();
        return head.getValue();
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<Q> current = head;
        for (int i = 0; i < size; i++){
            builder.append(current.getValue() + " ");
            current = current.getNext();
        }
        return "MyQueue{"+ builder.toString().trim() + "}";
    }
}
