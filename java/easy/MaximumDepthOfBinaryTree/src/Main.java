public class Main {
    public static void main(String[] args) {

        TreeNode ten = new TreeNode(10);
        TreeNode seven = new TreeNode(7, null, ten);
        TreeNode fifteen = new TreeNode(15);
        TreeNode twenty = new TreeNode(20, fifteen, seven);
        TreeNode nine = new TreeNode(9);
        TreeNode three = new TreeNode(3, nine, null);

        System.out.println(maxDepth(three));
    }

    public static int maxDepth(TreeNode root) {
        return helper(root, 0);
    }

    public static int helper(TreeNode root, int count) {
        if (root == null) {
            return count;
        }
        return Math.max(helper(root.left, count + 1), helper(root.right, count + 1));
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