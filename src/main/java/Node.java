public class Node<E> {
    private Node<E> previous;
    private Node<E> next;
    private final E value;

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPrevious() {
        return previous;
    }

    public Node<E> getNext() {
        return next;
    }

    public E getValue() {
        return value;
    }

    public Node(E value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
