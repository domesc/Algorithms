package linkedlist;

/**
 * Two numbers represented by a linked list, where each node has a digit.
 * Created by domesc on 21/02/16.
 */
public class SumLists {

    /**
     * Running Time: O(max(n,m)) where n and m are the length of the two lists
     */
    public Integer reverseOrderSum(Node<Integer> head1, Node<Integer> head2) {
        Node<Integer> n1 = head1;
        Node<Integer> n2 = head2;
        Node<Integer> resultHead = null;
        Node<Integer> resultTail = null;
        Integer carry = 0;
        while(n1 != null || n2 != null) {
            Integer resultValue = null;
            if (n1 != null && n2 != null) {
                resultValue = (n1.getValue() + n2.getValue() + carry) % 10;
                carry = (n1.getValue() + n2.getValue()+ carry) / 10;
                n1 = n1.getNext();
                n2 = n2.getNext();
            } else if (n1 != null && n2 == null) {
                resultValue = (n1.getValue() + carry) % 10;
                carry = (n1.getValue() + carry)/ 10;
                n1 = n1.getNext();
            } else if (n2 != null && n1 == null) {
                resultValue = (n2.getValue() + carry) % 10;
                carry = (n2.getValue() + carry) / 10;
                n2 = n2.getNext();
            }

            Node<Integer> nodeToAppend = new Node<>(resultValue, null);
            if (resultHead == null) {
                resultHead = nodeToAppend;
                resultTail = resultHead;
            } else {
                resultTail.setNext(nodeToAppend);
                resultTail = resultTail.getNext();
            }
        }

        return fromListToNumberReverse(resultHead);

    }

    /**
     * Running Time: O(max(n,m))
     */
    public Integer simpleReverseOrderSum(Node<Integer> head1, Node<Integer> head2) {
        int number1 = fromListToNumberReverse(head1);
        int number2 = fromListToNumberReverse(head2);

        return number1 + number2;

    }

    public Integer recursiveReverseOrderSum(
        Node<Integer> head1,
        Node<Integer> head2,
        Integer carry
    ) {
        Node<Integer> result = recursiveReverseOrderList(head1, head2, 0);
        return fromListToNumberReverse(result);
    }

    /**
     * Recursive version
     * Running Time: O(max(n,m))
     * */
    private Node<Integer> recursiveReverseOrderList(
        Node<Integer> head1,
        Node<Integer> head2,
        Integer carry) {
        if (head1 == null && head2 == null && carry == 0) {
           return null;
        }
        Node<Integer> result = new Node<>();
        Integer value = carry;
        if (head1 != null) {
            value += head1.getValue();
        }
        if (head2 != null) {
            value += head2.getValue();
        }
        Integer resValue = value % 10;
        carry = value / 10;
        result.setValue(resValue);
        if (head1 != null || head2 != null) {
            Node<Integer> next = recursiveReverseOrderList(
                head1 == null ? null : head1.getNext(),
                head2 == null ? null : head2.getNext(),
                carry);
            result.setNext(next);
        }

        return result;
    }

    /** Utility method to transform a reverse order list to a number */
    private int fromListToNumberReverse(Node<Integer> head) {
        int i = 0;
        int result = 0;
        Node<Integer> n = head;
        while (n != null) {
            result += n.getValue() * Math.pow(10,i);
            n = n.getNext();
            i++;
        }
        return result;
    }
}
