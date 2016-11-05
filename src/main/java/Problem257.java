import java.util.ArrayList;
import java.util.List;

/**
 * @author anobis
 */
public class Problem257 {
    public static void main(String[] args) {

    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();

        findPaths(root, new StringBuilder(), paths);
        return paths;
    }

    public static void findPaths(TreeNode root, StringBuilder curr, List<String> paths) {
        if (root == null) {
            return;
        }

        curr.append(root.val);
        if (root.left == null && root.right == null) {
            paths.add(curr.toString());
        }

        curr.append("->");
        StringBuilder split = new StringBuilder(curr.toString());


        findPaths(root.right, curr, paths);
        findPaths(root.left, split, paths);
    }
}
