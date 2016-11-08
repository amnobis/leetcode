/**
 * @author anobis
 */
public class Problem111 {
    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {

    }

    public int findDepth(TreeNode root, int depth) {
        if (root == null) {
            return 0;
        }
        int add = 0;

        if (root.left != null && root.right != null) {
            add = Math.min(findDepth(root.left, depth + 1), findDepth(root.right, depth+1));
        } else if (root.left != null) {
            add = findDepth(root.left, depth+1);
        } else if (root.right != null) {
            add = findDepth(root.right, depth+1);
        }

        return 1 + add;
    }

}
