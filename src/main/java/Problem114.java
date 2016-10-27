/**
 * @author anobis
 */
public class Problem114 {
    public static void main(String[] args) {
        TreeNode left0 = new TreeNode(null, null, 3);
        TreeNode right4 = new TreeNode(null, null, 4);
        TreeNode left2 = new TreeNode(left0, right4, 2);

        TreeNode right9 = new TreeNode(null, null, 7);
        TreeNode left7 = new TreeNode(null, null, 6);
        TreeNode right8 = new TreeNode(left7, right9, 5);

        TreeNode root = new TreeNode(left2, right8, 1);
        flatten(root);
    }

    public static void flatten(TreeNode root) {
        modify(root);
    }

    public static TreeNode modify(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode t = root;
        TreeNode tmp = root.right;

        root.right = modify(root.left);
        root.left = null;
        while (t.right != null) {
            t = t.right;
        }
        t.right = modify(tmp);

        return root;
    }
}
