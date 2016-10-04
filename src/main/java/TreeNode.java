/**
 * @author anobis <austin.nobis@amd.com>
 */
public class TreeNode {
   int val;
   TreeNode left;
   TreeNode right;

   TreeNode(TreeNode left, TreeNode right, int val) {
      this.left = left;
      this.right = right;
      this.val = val;
   }

   @Override
   public String toString() {
      final StringBuilder sb = new StringBuilder("TreeNode{");
      sb.append("val=").append(val);
      sb.append('}');
      return sb.toString();
   }
}
