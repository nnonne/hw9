public class MyStack <S>{
    private int size = 0;
    private Node<S> head ;  //first element in the list
    private Node<S> tail;  // last element in the list

    public MyStack(){
        head = null;
        tail = null;
        System.out.println("Stack was created, current size = " + size);
    }

    public void push(S value){
        Node<S> node = new Node<S>(value);
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
        System.out.println("Stack was cleared");

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
            Node<S> current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            Node<S> prev = current.getPrevious();
            Node<S> next = current.getNext();
            prev.setNext(next);
            next.setPrevious(prev);
        }
        size--;
        System.out.println("Item was removed successfully, current size = " + size);
    }
    public int size(){
        return size;
    }
    public S poll() {
        if (size == 0) throw new NullPointerException();
        Node<S> ans = tail;
        if (size == 1){
            head = null;
            tail = null;
        }
        else{
            tail = tail.getPrevious();
            tail.setNext(null);
        }
        size--;
        return ans.getValue();
    }
    public S peek(){
        if (size == 0) throw new NullPointerException();
        return tail.getValue();
    }
    @Override
    public String toString() {  //stack will be reversed
        StringBuilder builder = new StringBuilder();
        Node<S> current = tail;
        for (int i = 0; i < size; i++){
            builder.append(current.getValue() + " ");
            current = current.getPrevious();
        }
        return "MyStack{"+ builder.toString().trim() + "}";
    }
}

