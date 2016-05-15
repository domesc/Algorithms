package linkedlist;

/**
 * Created by domesc on 08/03/16.
 */
public class Reverse {
    // a->b->c
    public Node<Integer> reverseRec(Node<Integer> head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        Node<Integer> remaining = reverseRec(head.getNext());
        remaining.getNext().setNext(head); // node.next.next
        head.setNext(null);
        return remaining;
    }

    public Node<Integer> reverse(Node<Integer> curr) {
        Node<Integer> nextNode;
        Node<Integer> prev = null;
        while (curr != null) {
            nextNode = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
