import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem107 {
   public List<List<Integer>> levelOrderBottom(TreeNode root) {
      List<List<Integer>> vals = new ArrayList<>();

      levelOrder(root, 0, vals);
      Collections.reverse(vals);
      return vals;
   }

   public int levelOrder(TreeNode root, int level, List<List<Integer>> levels) {
      if (root == null) {
         return 0;
      }

      if (levels.size() > level) {
         List<Integer> vals = levels.get(level);
         vals.add(root.val);
      } else {
         List<Integer> list = new ArrayList<>();
         list.add(root.val);
         levels.add(list);
      }

      levelOrder(root.left, level+1, levels);
      levelOrder(root.right, level+1, levels);

      return level;
   }
}