package linkedlist;

import java.util.HashSet;
import java.util.Objects;

/**
 * remove duplicates from an unsorted linked list
 */
public class RemoveDups {

    /**
     * Running Time: O(n), but waste of memory using a supporting hash table
     */
    public Node<Integer> removeDuplicatesWithBuffer (Node<Integer> head) {
        HashSet<Integer> hashTable = new HashSet<>();
        Node<Integer> n = head;

        if (hashTable.contains(n.getValue())) {
            return n.getNext();
        }

        while (n.getNext() != null) {
            if (hashTable.contains(n.getNext().getValue())) {
                n.setNext(n.getNext().getNext());
            } else {
                hashTable.add(n.getNext().getValue());
            }
            n = n.getNext();
        }

        return head;
    }

    /**
     * Running Time: O(n^2), but memory O(1)
     */
    public Node<Integer> removeDuplicatesWithDoublePointer (Node<Integer> head) {
        Node<Integer> n1 = head;
        Node<Integer> n2 = head;

        while (n1.getNext() != null) {
            while (n2.getNext() != null) {
                if (Objects.equals(n1.getValue(), n2.getNext().getValue())) {
                    n2.setNext(n2.getNext().getNext());
                }
                n2 = n2.getNext();
            }
            n1 = n1.getNext();
        }

        return head;
    }
}
