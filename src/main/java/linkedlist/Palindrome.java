package linkedlist;

import java.util.Stack;

/**
 * Check if a linked list is palindrome
 * Created by domesc on 21/02/16.
 */
public class Palindrome {

    /**
     * Running Time: O(n)
     */
    public boolean check(Node<Integer> head) {
        Node<Integer> n1 = head;
        Node<Integer> n2 = reverse(head);
        return equalLists(n1, n2);
    }

    /**
     * Running Time: O(n), but more memory allocated using the stack.
     */
    public boolean checkWithStack(Node<Integer> head) {
        Stack<Integer> stack = new Stack<>();
        Node<Integer> n = head;
        while (n != null) {
            stack.push(n.getValue());
            n = n.getNext();
        }

        Node<Integer> n2 = head;
        while (n2 != null) {
            if (!n2.getValue().equals(stack.pop())) {
                return false;
            }
            n2 = n2.getNext();
        }
        return true;
    }

    private boolean equalLists(Node<Integer> head1, Node<Integer> head2) {
        while (head1.getNext() != null && head2.getNext() != null) {
            if (!head1.getValue().equals(head2.getValue()))
                return false;
            head1 = head1.getNext();
            head2 = head2.getNext();
        }
        return true;
    }

    private int findLength(Node<Integer> head) {
        int i = 0;
        Node<Integer> n = head;

        while (n != null) {
            i++;
            n = n.getNext();
        }
        return i;
    }

    private Node<Integer> reverse(Node<Integer> head) {
        Node<Integer> n = head;
        Node<Integer> newHead = null;
        while (n != null) {
            if (newHead == null) {
                newHead = new Node<>(n.getValue(), null);
            } else {
                newHead = new Node<>(n.getValue(), newHead);
            }
            n = n.getNext();
        }
        return newHead;
    }
}
