package linkedlist;

/**
 * Partition a linked list around a value x. All nodes less than x before all nodes
 * greater than or equal to x.
 * Created by domesc on 21/02/16.
 */
public class Partition {

    /**
     * Running time: O(n)
     */
    public Node<Integer> makePartition(Node<Integer> head, Integer x) {
        Node<Integer> n = head;
        Node<Integer> h2 = new Node<>();
        Node<Integer> n2 = h2;

        if (head.getValue().compareTo(x) >= 0) {
            head = head.getNext();
        }

        while (n.getNext() != null) {
            if (n.getValue().compareTo(x) >= 0) {
                Node<Integer> node = copy(n);
                // remove the node greater than x
                n.setValue(n.getNext().getValue());
                n.setNext(n.getNext().getNext());
                //copy this node to the list of greater nodes
                if (n2.getValue() == null) {
                    n2 = node;
                    h2 = n2;
                } else {
                    n2.setNext(node);
                    n2 = n2.getNext();
                }
            } else {
                n = n.getNext();
            }
        }

        n.setNext(h2);

        return head;
    }

    private Node<Integer> copy(Node<Integer> node) {
        return new Node<>(node.getValue(), null);
    }

}
