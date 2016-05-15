package linkedlist;

/**
 * Find the kth element to the last one in a Singly Linked List
 * Created by domesc on 21/02/16.
 */
public class KToLast {
    /**
     * Running Time: O(n)
     */
    public Node<Integer> computeKthElement(Node<Integer> head, int k) {
        int len = findLength(head);
        Node<Integer> n2 = head;
        int i =0;
        while (n2.getNext() != null) {
            if (i == len - k) {
                break;
            }
            i++;
            n2 = n2.getNext();
        }
        if (!(i==len-k)) {
            // kth element not found
            return null;
        }
        return n2;
    }

    public Node<Integer> recursiveKthElement(Node<Integer> head, int k) {
        int len = findLength(head);
        return recursiveSearch(head, 0, k, len);
    }

    private Node<Integer> recursiveSearch(Node<Integer> head, int index, int k, int len) {
        if (head == null) {
            return null;
        }
        if (index == len - k) {
            return head;
        }
        return recursiveSearch(head.getNext(), index+1, k, len);
    }

    private int findLength(Node<Integer> head) {
        Node<Integer> n1 = head;
        int len = 1;
        //find total length of the list
        while (n1.getNext() != null) {
            len++;
            n1 = n1.getNext();
        }
        return len;
    }
}
