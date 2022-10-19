
public class Main {
    public static void main(String[] args) {

//                TreeNode seven = new TreeNode(7);
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

        System.out.println(minDepth(one));

    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lHeight = minDepth(root.left) + 1;
        int rHeight = minDepth(root.right) + 1;

        if (lHeight >= 2 && rHeight >= 2) {
            return Math.min(lHeight, rHeight);
        } else {
            if (lHeight < 2) {
                return rHeight;
            } else {
                return lHeight;
            }
        }

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