import java.util.ArrayList;
import java.util.List;

/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem102 {
   public static void main(String[] args) {

   }

   public static List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> vals = new ArrayList<>();

      levelOrder(root, 0, vals);
      return vals;
   }

   public static int levelOrder(TreeNode root, int level, List<List<Integer>> levels) {
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

      int right = levelOrder(root.left, level+1, levels);
      int left = levelOrder(root.right, level+1, levels);

      return level;
   }
}
