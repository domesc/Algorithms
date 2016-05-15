package linkedlist;

/**
 * Delete a node in the middle (any node but the first and last, not necessarily the exact middle).
 * The only node to delete is passed to the method, not the head.
 * Created by domesc on 21/02/16.
 */
public class DeleteMiddle {
    public void removeAnyMiddle(Node<Integer> node) {
        if (node == null || node.getNext() == null) {
            return;
        }
        node.setValue(node.getNext().getValue());
        node.setNext(node.getNext().getNext());
    }
}
