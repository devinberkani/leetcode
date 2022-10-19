public class Main {
    public static void main(String[] args) {

//        TreeNode seven = new TreeNode(7);
//        TreeNode fifteen = new TreeNode(15);
//        TreeNode twenty = new TreeNode(20, fifteen, seven);
//        TreeNode nine = new TreeNode(9);
//        TreeNode three = new TreeNode(3, nine, twenty);



        TreeNode four = new TreeNode(4);
        TreeNode four2 = new TreeNode(4);
        TreeNode three = new TreeNode(3, four, four2);
        TreeNode three2 = new TreeNode(3);
        TreeNode two = new TreeNode(2, three, three2);
        TreeNode two2 = new TreeNode(2);
        TreeNode one = new TreeNode(1, two, two2);

        System.out.println(isBalanced(one));

//        TreeNode eight = new TreeNode(8);
//        TreeNode six = new TreeNode();
//        TreeNode five = new TreeNode();
//        TreeNode four = new TreeNode();
//        TreeNode three = new TreeNode(3);
//        TreeNode two = new TreeNode(2);
//        TreeNode one = new TreeNode(1, two, three);


    }

    public static boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }
        if (Math.abs(height(root.left) - height(root.right)) <= 1) {
            return isBalanced(root.left) && isBalanced(root.right);
        } else {
            return false;
        }

    }
    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lHeight = height(root.left);
        int rHeight = height(root.right);

        return Math.max(lHeight, rHeight) + 1;
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