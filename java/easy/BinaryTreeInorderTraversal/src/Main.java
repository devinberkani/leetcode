import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode g = new TreeNode(7);
        TreeNode f = new TreeNode(5);
        TreeNode c = new TreeNode(6, f, g);
        TreeNode e = new TreeNode(3);
        TreeNode d = new TreeNode(1);
        TreeNode b = new TreeNode(2, d, e);
        TreeNode a = new TreeNode(4, b, c);

        System.out.println(inorderTraversal(a));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        helper(result, root);

        return result;
    }

    public static void helper(List<Integer> result, TreeNode root ) {
        if (root == null) {
            return;
        }

        helper(result, root.left);
        result.add(root.val);
        helper(result, root.right);
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }