package trees;

/**
 * Given a sorted (increasing order) array with unique integer elements create a binary search tree with minimal height
 * Created by domesc on 24/02/16.
 */
public class MinimalTree {
    public TreeNode<Integer> createTree(Integer[] sortedArray, int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (end + start)/2;
        TreeNode<Integer> node = new TreeNode<>(sortedArray[mid]);
        node.setLeft(createTree(sortedArray, start, mid - 1));
        node.setRight(createTree(sortedArray, mid + 1, end));
        return node;
    }
}
