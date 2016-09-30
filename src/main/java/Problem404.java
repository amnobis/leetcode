/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem404 {
   public static void main(String[] args) {
      TreeNode right = new TreeNode(null, null, 1);
      TreeNode left = new TreeNode(null, null, 1);
      TreeNode root = new TreeNode(left, right, 1);

      System.out.println(sumOfLeftLeaves(root));
   }

   public static int sumOfLeftLeaves(TreeNode root) {
      int value = 0;

      if (root == null) {
         return 0;
      }

      if (root.left != null && root.left.left == null && root.left.right == null) {
         value = root.left.val;
      }

      value += sumOfLeftLeaves(root.left);
      value += sumOfLeftLeaves(root.right);

      return value;
   }
}
