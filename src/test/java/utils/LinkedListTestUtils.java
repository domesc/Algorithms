package utils;

import linkedlist.Node;

/**
 * Created by domesc on 21/02/16.
 */
public class LinkedListTestUtils {
    public static boolean verify(Node<Integer> head, Integer[] expected) {
        int i = 0;
        Node<Integer> n = head;
        while(n.getNext() != null && i < expected.length) {
            if (!expected[i].equals(n.getValue())) {
                return false;
            }
            i++;
            n = n.getNext();
        }
        return true;
    }

    public static Node<Integer> fromArrayToList(Integer[] array) {
        Node<Integer> head = new Node<>(array[0], null);
        for (int i=1; i<array.length;i++) {
            head.appendToTail(array[i]);
        }
        return head;
    }
}
