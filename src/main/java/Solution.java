public class Solution {
    public boolean isSymmetric(TreeNode root) {

        // if root is null, return true
        if (root == null) {
            return true;
        }

        // helper method which compares left subtree
        // and right subtree
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {

        // if either left or right is null
        // check to see if the other is null
        if (left == null || right == null) {
            return left == right;
        }

        // if values are not equal, subtrees are not symmetric
        if (left.val != right.val) {
            return false;
        }

        // compare
        // "left left" and "right right"
        // compare "left right" and "right left"
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
