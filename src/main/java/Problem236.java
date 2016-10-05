/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem236 {
   public static void main(String[] args) {

   }

   public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if (root == null) {
         return null;
      }

      if (root == p || root == q) {
         return root;
      } else {
         TreeNode left = lowestCommonAncestor(root.left, p, q);
         TreeNode right = lowestCommonAncestor(root.right, p, q);

         if (left != null && right != null) {
            return root;
         } else if (left != null) {
            return left;
         }
         return right;
      }
   }
}
