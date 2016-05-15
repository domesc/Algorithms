package trees;

/**
 * Find the next node (in-order successor) of a given node in a BST
 * Created by domesc on 01/03/16.
 */
public class Successor {
    public TreeNode<Integer> findLeftMost(TreeNode<Integer> node) {
        if (node == null) {
            return null;
        }
        if (node.getLeft() == null) {
            return node;
        }
        return findLeftMost(node.getLeft());
    }

    public TreeNode<Integer> findSuccessor(TreeNode<Integer> node) {
        return findLeftMost(node.getRight());
    }

}
