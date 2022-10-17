public class Main {
    public static void main(String[] args) {
        TreeNode g = new TreeNode(7);
        TreeNode f = new TreeNode(5);
        TreeNode c = new TreeNode(6, f, g);
        TreeNode e = new TreeNode(3);
        TreeNode d = new TreeNode(1);
        TreeNode b = new TreeNode(2, d, e);
        TreeNode a = new TreeNode(4, b, c);

        System.out.println(isSameTree(a, b));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }

        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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