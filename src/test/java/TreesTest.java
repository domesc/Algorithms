import org.junit.Assert;
import org.junit.Test;
import trees.*;

import java.util.ArrayList;

/**
 * Created by domesc on 15/05/16.
 */
public class TreesTest {
    @Test
    public void checkBalancedTest() {
        CheckBalanced algo = new CheckBalanced();

        Integer[] arr = new Integer[]{1,2,3,4,5};
        MinimalTree tree = new MinimalTree();
        TreeNode<Integer> root = tree.createTree(arr, 0, arr.length - 1);

        Assert.assertTrue(algo.check(root));

        root = TreeUtils.createUnbalancedTree();
        Assert.assertFalse(algo.check(root));
    }

    @Test
    public void findHeightTest() {
        Height algo = new Height();

        Integer[] arr = new Integer[]{1,2,3,4,5};
        MinimalTree tree = new MinimalTree();
        TreeNode<Integer> root = tree.createTree(arr, 0, arr.length - 1);

        int height = algo.findHeight(root);
        Assert.assertEquals(3, height);
    }

    @Test
    public void minimalTreeTest() {
        MinimalTree algo = new MinimalTree();

        Integer[] arr = new Integer[]{1,2,3,4,5};
        TreeNode<Integer> root = algo.createTree(arr, 0, arr.length - 1);
        ArrayList<Integer> list = new ArrayList<>();
        TreeUtils.convertTreeToList(root, list);
        int index = 0;
        for (Integer i : list) {
            Assert.assertTrue(i.equals(arr[index]));
            index++;
        }
    }

    @Test
    public void pathsInTreeTest() {
        PathsInTree algo = new PathsInTree();

        TreeNode<Integer> node0 = new TreeNode<>(0);
        TreeNode<Integer> node6 = new TreeNode<>(6);
        TreeNode<Integer> node52 = new TreeNode<>(5);
        TreeNode<Integer> node3 = new TreeNode<>(3, null, node52);
        TreeNode<Integer> node5 = new TreeNode<>(5, null, node6);
        TreeNode<Integer> node4 = new TreeNode<>(4, null, node5);
        TreeNode<Integer> node1 = new TreeNode<>(1, node0, node4);
        TreeNode<Integer> root = new TreeNode<>(2, node1, node3);

        node0.setParent(node1);
        node6.setParent(node5);
        node5.setParent(node4);
        node4.setParent(node1);
        node1.setParent(root);
        node3.setParent(root);
        node52.setParent(node3);

        algo.findPaths(root, 5);
    }

    @Test
    public void successorTest() {
        Successor algo = new Successor();

        TreeNode<Integer> node9 = new TreeNode<>(9);
        TreeNode<Integer> node7 = new TreeNode<>(7);
        TreeNode<Integer> node12 = new TreeNode<>(12);
        TreeNode<Integer> node14 = new TreeNode<>(14);
        TreeNode<Integer> node5 = new TreeNode<>(5, null, node7);
        TreeNode<Integer> node8 = new TreeNode<>(8, node5, node9);
        TreeNode<Integer> node11 = new TreeNode<>(11, null, node12);
        TreeNode<Integer> node13 = new TreeNode<>(13, node11, node14);
        TreeNode<Integer> root = new TreeNode<>(10, node8, node13);

        Assert.assertTrue(algo.findSuccessor(root).getValue().equals(node11.getValue()));
        Assert.assertTrue(algo.findSuccessor(node13).getValue().equals(node14.getValue()));
    }
}
