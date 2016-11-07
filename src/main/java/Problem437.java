/**
 * @author anobis
 */
public class Problem437 {
    public static void main(String[] args) {

    }

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        int value = (sum - root.val == 0) ? 1 : 0;

        int right = pathSum(root.right, sum-root.val);
        int left = pathSum(root.left, sum-root.val);

        return value + right + left;
    }
}
