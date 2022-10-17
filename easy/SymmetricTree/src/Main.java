public class Main {
    public static void main(String[] args) {
        TreeNode g = new TreeNode(1);
        TreeNode f = new TreeNode(2);
        TreeNode c = new TreeNode(2, f, null);
        TreeNode e = new TreeNode(3);
        TreeNode d = new TreeNode(2);
        TreeNode b = new TreeNode(2, d, null);
        TreeNode a = new TreeNode(1);

        System.out.println(isSymmetric(a));
    }

    public static boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
    }

    public static boolean helper(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }

        return p.val == q.val && helper(p.left, q.right) && helper(p.right, q.left);
    }

//    public static boolean isSymmetric(TreeNode root) {
//        List<Integer> list1 = new ArrayList<>();
//
//        helper(list1, root);
//
//        if (list1.size() % 2 == 0) {
//            return false;
//        }
//
//        List<Integer> beginning = list1.subList(0, (list1.size() / 2));
//        List<Integer> end = list1.subList((list1.size() / 2) + 1, list1.size());
//        Collections.reverse(end);
//
//        System.out.println(beginning);
//        System.out.println(end);
//
//        return beginning.equals(end);
//    }
//
//    public static void helper(List<Integer> list, TreeNode root) {
//        if (root == null) {
//            list.add(-1);
//            return;
//        }
//
//        helper(list, root.left);
//        list.add(root.val);
//        helper(list, root.right);
//    }
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