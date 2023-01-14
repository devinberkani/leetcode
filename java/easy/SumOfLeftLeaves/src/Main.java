public class Main {
    public static void main(String[] args) {

        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7, six, null);
        TreeNode fifteen = new TreeNode(15);
        TreeNode twenty = new TreeNode(20, fifteen, seven);
        TreeNode eight = new TreeNode(8);
        TreeNode nine = new TreeNode(9, eight, null);
        TreeNode three = new TreeNode(3, nine, twenty);

        System.out.println(sumOfLeftLeaves(three));
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        return helper(root, 0, false);
    }

    public static int helper(TreeNode root, int sum, boolean isLeft) {
        if (root == null) {
            return sum;
        }

        if (root.left == null && root.right == null && isLeft) {
            sum += root.val;
        }

        return helper(root.left, sum, true) + helper(root.right, 0, false);
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