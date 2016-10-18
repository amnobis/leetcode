/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem110 {
    public static void main(String[] args) {

    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        int left = depth(root.left);
        int right = depth(root.right);
        boolean result = (Math.abs(left-right) <= 1);

        if (result) {
            result = isBalanced(root.left);
            result &= isBalanced(root.right);
            return result;
        }
        return false;
    }

    public static int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 1;

        int left = depth(root.left);
        int right = depth(root.right);

        depth += max(left, right);
        return depth;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}
