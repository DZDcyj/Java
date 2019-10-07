import org.jetbrains.annotations.Contract;

public class Solution_PathSum {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        @Contract(pure = true)
        TreeNode(int x) {
            val = x;
        }
    }

    @Contract("null, _ -> false")
    private static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.val == sum && root.left == null && root.right == null)
            return true;
        boolean left = false, right = false;
        if (root.left != null)
            left = hasPathSum(root.left, sum - root.val);
        if (root.right != null)
            right = hasPathSum(root.right, sum - root.val);
        return left || right;
    }

    public static void main(String[] args) {
        TreeNode test = new TreeNode(5);
        test.left = new TreeNode(4);
        test.left.left = new TreeNode(11);
        test.left.left.left = new TreeNode(7);
        test.left.left.right = new TreeNode(2);
        test.right = new TreeNode(8);
        test.right.left = new TreeNode(13);
        test.right.right = new TreeNode(4);
        test.right.right.right = new TreeNode(1);
        System.out.println(hasPathSum(test, 22));

        TreeNode test2 = new TreeNode(1);
        test2.left = new TreeNode(2);
        System.out.println(hasPathSum(test2, 1));
    }
}
