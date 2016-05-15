package trees;

/**
 * Find and print the paths in a tree between the root and the node with the value equals to the value passed in
 * the function
 * Created by domesc on 25/02/16.
 */
public class PathsInTree {

    public void findPaths(TreeNode<Integer> root, Integer n) {
        if (root == null) {
            return;
        }
        if (root.getValue().equals(n)) {
            printPath(root);
            System.out.println(" ");
        }
        findPaths(root.getLeft(), n);
        findPaths(root.getRight(), n);
    }

    private void printPath(TreeNode<Integer> node) {
        if(node == null) {
            return;
        }

        printPath(node.getParent());
        System.out.print(node.getValue() + " -> ");
    }
}
