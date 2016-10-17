/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem101 {
   public static void main(String[] args) {

   }

   public static boolean isSymmetric(TreeNode root) {
      if (root == null) {
         return true;
      }

      return symmetry(root.left, root.right);
   }

   public static boolean symmetry(TreeNode left, TreeNode right) {
      if (left == null && right == null) {
         return true;
      } else if (left == null) {
         return false;
      } else if (right == null) {
         return false;
      }
      boolean result = left.val == right.val;

      result &= symmetry(left.left, right.right);
      result &= symmetry(left.right, right.left);
      return result;
   }
}
