import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode g = new TreeNode(7);
        TreeNode f = new TreeNode(6);
        TreeNode c = new TreeNode(3, f, g);
        TreeNode e = new TreeNode(5);
        TreeNode d = new TreeNode(4);
        TreeNode b = new TreeNode(2, d, e);
        TreeNode a = new TreeNode(1, b, c);

        System.out.println(preorderTraversal(a));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        helper(root, result);

        return result;
    }

    public static void helper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        list.add(root.val);
        helper(root.left, list);
        helper(root.right, list);
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