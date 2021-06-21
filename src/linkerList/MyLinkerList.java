package linkerList;

public class MyLinkerList<E> {
    private Node<E> head;
    private int numberNode;

    public MyLinkerList() {
    }

    public void add(int index, E element) {
        if (index > numberNode) {
            System.out.println("index lớn hơn size");
        } else {
            Node<E> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node<E> nodeNew = new Node<E>(element);
            nodeNew = temp.next;
            temp.next = nodeNew;
            numberNode++;
        }
    }

    public void remove(int index) {
        Node<E> temp = head;
        if (index < 0) {
            System.out.println("node null");
        } else {

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            numberNode--;
        }
    }


    public void addFirst(E e) {
        Node node = new Node(e);
        node.next = head;
        head = node;
        numberNode++;
    }

    public void addLast(E e) {
        Node temp = head;
        for (int i = 0; i < numberNode - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(e);
        temp.next = node;
        numberNode++;
    }


    public Boolean remove(E e) {
        Node temp = head;
        for (int i = 0; i < numberNode - 1; i++) {
            temp = temp.next;
            if (temp.getData() == e) {
                break;
            }
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
            numberNode--;
            return true;
        } else return false;
    }
}
