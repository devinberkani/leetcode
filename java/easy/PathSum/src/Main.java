public class Main {
    public static void main(String[] args) {
        //                TreeNode seven = new TreeNode(7);
//        TreeNode fifteen = new TreeNode(15);
//        TreeNode twenty = new TreeNode(20, fifteen, seven);
//        TreeNode nine = new TreeNode(9);
//        TreeNode three = new TreeNode(3, nine, twenty);

        TreeNode four = new TreeNode(4);
        TreeNode four2 = new TreeNode(4);
        TreeNode three = new TreeNode(-7, four, four2);
        TreeNode three2 = new TreeNode(3);
        TreeNode two = new TreeNode(2, three, three2);
        TreeNode two2 = new TreeNode(2);
        TreeNode one = new TreeNode(-1, two, two2);

        System.out.println(hasPathSum(one, 1));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (targetSum - root.val == 0 && root.left == null && root.right == null) {
            return true;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
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