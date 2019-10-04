import org.jetbrains.annotations.Contract;

public class Solution_MaximumDepthOfBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;


        @Contract(pure = true)
        TreeNode(int x) {
            val = x;
        }
    }

    @Contract(pure = true)
    private static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode test = new TreeNode(3);
        test.left = new TreeNode(9);
        test.right = new TreeNode(20);
        test.right.left = new TreeNode(15);
        test.right.right = new TreeNode(7);

        System.out.println(maxDepth(test));
    }
}
