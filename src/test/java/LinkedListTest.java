import linkedlist.*;
import org.junit.Assert;
import org.junit.Test;
import utils.LinkedListTestUtils;

/**
 * Created by domesc on 15/05/16.
 */
public class LinkedListTest {

    @Test
    public void rdeleteAnyMiddleTest() {
        DeleteMiddle algo = new DeleteMiddle();

        Integer[] arr = new Integer[]{5,2,8,5,6,9,1,2};
        Node<Integer> head = new Node<>(arr[0], null);
        for (int i=1; i<arr.length;i++) {
            head.appendToTail(arr[i]);
        }

        Integer[] expected = new Integer[]{5,2,8,5,9,1,2};
        Node<Integer> toRemove = findNode(head, 6);

        algo.removeAnyMiddle(toRemove);
        Assert.assertTrue(LinkedListTestUtils.verify(head, expected));
    }

    @Test
    public void kToLastTest() {
        KToLast algo = new KToLast();

        Integer[] arr = new Integer[]{5,2,8,5,6,9,1,2};
        Node<Integer> head = new Node<>(arr[0], null);
        for (int i=1; i<arr.length;i++) {
            head.appendToTail(arr[i]);
        }

        Node<Integer> result = algo.computeKthElement(head, 4);
        Assert.assertEquals(6, result.getValue().intValue());

        result = algo.recursiveKthElement(head, 4);
        Assert.assertEquals(6, result.getValue().intValue());
        result = algo.recursiveKthElement(head, 6);
        Assert.assertEquals(8, result.getValue().intValue());
    }

    @Test
    public void palindromeTest() {
        Palindrome algo = new Palindrome();

        Integer[] arr = new Integer[]{7,1,6,1,7};
        Node<Integer> head = LinkedListTestUtils.fromArrayToList(arr);
        Integer[] arr2 = new Integer[]{7,2,6,1,7};
        Node<Integer> headNotPal = LinkedListTestUtils.fromArrayToList(arr2);

        Assert.assertTrue(algo.check(head));
        Assert.assertFalse(algo.check(headNotPal));

        Assert.assertTrue(algo.checkWithStack(head));
        Assert.assertFalse(algo.checkWithStack(headNotPal));
    }

    @Test
    public void partitionTest() {
        Partition algo = new Partition();

        Integer[] arr = new Integer[]{3,5,8,5,10,2,1};
        Node<Integer> head = new Node<>(arr[0], null);
        for (int i=1; i<arr.length;i++) {
            head.appendToTail(arr[i]);
        }
        Node<Integer> newHead = algo.makePartition(head, 5);
        Integer[] expected = new Integer[]{3,2,1,5,8,5,10};

        Assert.assertTrue(LinkedListTestUtils.verify(newHead, expected));
    }

    @Test
    public void removeDupsTest() {
        RemoveDups algo = new RemoveDups();

        Integer[] arrWithDups = new Integer[]{5,2,8,5,6,9,1,2};
        Integer[] arrWithoutDups = new Integer[]{5,2,8,6,9,1};
        Node<Integer> head = new Node<>(arrWithDups[0], null);
        for (int i=1; i<arrWithDups.length;i++) {
            head.appendToTail(arrWithDups[i]);
        }
        Node<Integer> firstTestHead = algo.removeDuplicatesWithDoublePointer(head);

        Assert.assertTrue(LinkedListTestUtils.verify(firstTestHead, arrWithoutDups));

        Node<Integer> secondTestHead = algo.removeDuplicatesWithDoublePointer(head);

        Assert.assertTrue(LinkedListTestUtils.verify(secondTestHead, arrWithoutDups));
    }

    @Test
    public void sumListsTest() {
        SumLists algo = new SumLists();

        Integer[] number1 = new Integer[]{7,1,6};
        Integer[] number2 = new Integer[]{5,9,2};
        Node<Integer> headNumber1 = LinkedListTestUtils.fromArrayToList(number1);
        Node<Integer> headNumber2 = LinkedListTestUtils.fromArrayToList(number2);

        Assert.assertEquals(912, algo.reverseOrderSum(headNumber1, headNumber2).intValue());
        Assert.assertEquals(912, algo.simpleReverseOrderSum(headNumber1, headNumber2).intValue());
        Assert.assertEquals(912, algo.recursiveReverseOrderSum(headNumber1, headNumber2, 0).intValue());

        number1 = new Integer[]{7,1,6,5};
        number2 = new Integer[]{5,9,2};
        headNumber1 = LinkedListTestUtils.fromArrayToList(number1);
        headNumber2 = LinkedListTestUtils.fromArrayToList(number2);

        Assert.assertEquals(5912, algo.reverseOrderSum(headNumber1, headNumber2).intValue());
        Assert.assertEquals(5912, algo.simpleReverseOrderSum(headNumber1, headNumber2).intValue());
        Assert.assertEquals(5912, algo.recursiveReverseOrderSum(headNumber1, headNumber2, 0).intValue());

    }

    private Node<Integer> findNode (Node<Integer> head, Integer value) {
        while(head.getNext() != null) {
            if (value.equals(head.getValue()))
                return head;
            head = head.getNext();
        }

        return null;
    }
}
