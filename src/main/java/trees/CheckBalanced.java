package trees;

/**
 * Check if a binary tree is balanced
 * Created by domesc on 26/02/16.
 */
public class CheckBalanced {
    public boolean check(TreeNode<Integer> root) {
        if (root == null)
            return true;
        int heightLeft = findHeight(root.getLeft());
        int heightRight = findHeight(root.getRight());
        int diff = heightLeft - heightRight;
        if(Math.abs(diff) > 1)
            return false;

        return check(root.getLeft()) && check(root.getRight());

    }

    private int findHeight(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(findHeight(root.getLeft()), findHeight(root.getRight()));
    }

    private class HeightAndCondition {
        private int height;
        private boolean isBalanced;

        public HeightAndCondition(int height, boolean isBalanced) {
            this.height = height;
            this.isBalanced = isBalanced;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public boolean isBalanced() {
            return isBalanced;
        }

        public void setIsBalanced(boolean isBalanced) {
            this.isBalanced = isBalanced;
        }
    }
}
