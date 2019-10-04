import org.jetbrains.annotations.Contract;

public class Solution_SymmetricTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        @Contract(pure = true)
        TreeNode(int x) {
            val = x;
        }
    }

    @Contract("null -> true")
    private static boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        return isSameTree(root.left, root.right);
    }

    @Contract("null, !null -> false; !null, null -> false; null, null -> true")
    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q != null)
            return false;
        else if (p != null && q == null)
            return false;
        else if (p == null)
            return true;
        if (p.val != q.val)
            return false;
        if ((p.left == null && q.right != null) || (p.left != null && q.right == null) || (p.right == null && q.left != null) || (p.right != null && q.left == null))
            return false;
        if (p.left != null && p.right != null)
            return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
        else if (p.right != null)
            return isSameTree(p.right, q.left);
        else if (p.left != null)
            return isSameTree(p.left, q.right);
        else return true;
    }

    public static void main(String[] args) {
        TreeNode test1 = new TreeNode(1);
        test1.left = new TreeNode(2);
        test1.left.left = new TreeNode(3);
        test1.left.right = new TreeNode(4);
        test1.right = new TreeNode(2);
        test1.right.left = new TreeNode(4);
        test1.right.right = new TreeNode(3);

        TreeNode test2 = new TreeNode(1);
        test2.left = new TreeNode(2);
        test2.left.right = new TreeNode(3);
        test2.right = new TreeNode(2);
        test2.right.right = new TreeNode(3);

        System.out.println(isSymmetric(test1));
        System.out.println(isSymmetric(test2));
    }
}
