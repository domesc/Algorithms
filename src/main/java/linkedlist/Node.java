package linkedlist;

/**
 * Node of a linked list
 */
public class Node<T extends Comparable> {
    private T value;
    private Node<T> next;

    public Node() {}

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void appendToTail(T value) {
        Node<T> end = new Node<>(value, null);
        Node<T> n = this;

        while (n.next != null) {
            n = n.next;
        }

        n.next = end;
    }

    public Node<T> removeNode(Node<T> head, T value) {
        Node<T> n = head;
        if (n.value.compareTo(value) == 0) {
            return head.next;
        }
        while(n.next != null) {
            if (n.next.value.compareTo(value) == 0) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }
}
