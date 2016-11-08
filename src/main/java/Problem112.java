/**
 * @author anobis
 */
public class Problem112 {
    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        boolean value = false;

        if (root.left == null && root.right == null) {
            value = (sum - root.val == 0);
        }

        boolean right = hasPathSum(root.right, sum-root.val);
        boolean left = hasPathSum(root.left, sum-root.val);

        return value || right || left;
    }
}
