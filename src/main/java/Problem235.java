import java.util.ArrayList;
import java.util.List;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem235 {
   public static void main(String[] args) {
      TreeNode left0 = new TreeNode(null, null, 0);
      TreeNode right4 = new TreeNode(null, null, 4);
      TreeNode left2 = new TreeNode(left0, right4, 2);

      TreeNode right9 = new TreeNode(null, null, 8);
      TreeNode left7 = new TreeNode(null, null, 7);
      TreeNode right8 = new TreeNode(left7, right9, 8);

      TreeNode root = new TreeNode(left2, right8, 6);

      System.out.println(lowestCommonAncestor(root, left2, right4));
   }

   public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if (root == null) {
         return null;
      }

      int lowVal = (p.val >  q.val) ? q.val : p.val;
      int highVal = (p.val > q.val) ? p.val : q.val;
      TreeNode res = null;

      while (res == null) {
         if (root.val < lowVal) {
            root = root.right;
         } else if (root.val > highVal){
            root = root.left;
         } else {
            res = root;
         }
      }

      return res;
   }
}
