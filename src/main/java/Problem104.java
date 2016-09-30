/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem104 {
   public static void main(String[] args) {
      TreeNode right = new TreeNode(null, null, 1);
      TreeNode left = new TreeNode(null, null, 1);
      TreeNode root = new TreeNode(left, right, 1);

      System.out.println(maxDepth(root));
   }

   public static int maxDepth(TreeNode root) {
      if (root == null) {
         return 0;
      }
      if (root.left == null && root.right == null) {
         return 1;
      }

      int left = maxDepth(root.left);
      int right = maxDepth(root.right);

      return 1 + ((left > right) ? left : right);
   }
}
