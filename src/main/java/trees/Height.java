package trees;

/**
 * Find the height of a tree
 * Created by domesc on 25/02/16.
 */
public class Height {
    public int findHeight(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(findHeight(root.getLeft()), findHeight(root.getRight()));
    }
}
