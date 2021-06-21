package linkerList;

public class Node<E> {
    Node<E> next;
    private Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
