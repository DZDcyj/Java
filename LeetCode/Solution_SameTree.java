import org.jetbrains.annotations.Contract;

public class Solution_SameTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        @Contract(pure = true)
        TreeNode(int x) {
            val = x;
        }
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
        if ((p.left == null && q.left != null) || (p.left != null && q.left == null) || (p.right == null && q.right != null) || (p.right != null && q.right == null))
            return false;
        if (p.left != null && p.right != null)
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        else if (p.right != null)
            return isSameTree(p.right, q.right);
        else if (p.left != null)
            return isSameTree(p.left, q.left);
        else return true;
    }

    public static void main(String[] args) {
        TreeNode test1 = new TreeNode(1);
        test1.left = new TreeNode(2);
        test1.right = new TreeNode(3);

        TreeNode test2 = new TreeNode(1);
        test2.left = new TreeNode(2);
        test2.right = new TreeNode(3);

        TreeNode test3 = new TreeNode(1);
        test3.left = new TreeNode(2);

        TreeNode test4 = new TreeNode(1);
        test4.left = null;
        test4.right = new TreeNode(2);

        System.out.println(isSameTree(test1, test2));
        System.out.println(isSameTree(test3, test4));
    }
}
