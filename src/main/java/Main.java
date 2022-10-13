public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode leftSideFour = new TreeNode(4);
        TreeNode leftSideThree = new TreeNode(3);
        TreeNode leftSideTwo = new TreeNode(2, leftSideThree, leftSideFour);

        TreeNode rightSideFour = new TreeNode(4);
        TreeNode rightSideThree = new TreeNode(3);
        TreeNode rightSideTwo = new TreeNode(2, rightSideFour, rightSideThree);

        TreeNode root = new TreeNode(1, leftSideTwo, rightSideTwo);

        System.out.println("Example One : " + solution.isSymmetric(root));
    }
}
