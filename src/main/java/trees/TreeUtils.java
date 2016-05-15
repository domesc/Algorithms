package trees;

import java.util.ArrayList;

/**
 * Created by domesc on 25/02/16.
 */
public class TreeUtils {
    public static void convertTreeToList(TreeNode<Integer> root, ArrayList<Integer> list) {
        if (root != null) {
            convertTreeToList(root.getLeft(), list);
            list.add(root.getValue());
            convertTreeToList(root.getRight(), list);
        }
    }

    public static TreeNode<Integer> createUnbalancedTree() {
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

        return root;
    }

    public static TreeNode<Integer> createBSTfromArray(Integer[] array) {
        TreeNode<Integer> root = new TreeNode<>(array[0]);
        for (int i=1; i< array.length; i++) {
            insertNodeInBST(root, new TreeNode<>(array[i]));
        }
        return root;
    }

    public static void insertNodeInBST(TreeNode<Integer> root, TreeNode<Integer> nodeToInsert) {
        if (nodeToInsert.getValue() >= root.getValue()) {
            if (root.getRight() == null) {
                root.setRight(nodeToInsert);
            } else {
                insertNodeInBST(root.getRight(), nodeToInsert);
            }
        }

        if (nodeToInsert.getValue() < root.getValue()) {
            if (root.getLeft() == null) {
                root.setLeft(nodeToInsert);
            } else {
                insertNodeInBST(root.getLeft(), nodeToInsert);
            }
        }

    }
}
