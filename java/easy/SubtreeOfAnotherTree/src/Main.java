import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        TreeNode five = new TreeNode(5);
        TreeNode zero = new TreeNode(0);
        TreeNode two = new TreeNode(2, zero, null);
        TreeNode one = new TreeNode(1);
        TreeNode four = new TreeNode(4, one, two);
        TreeNode three = new TreeNode(3, four, five);

        TreeNode two2 = new TreeNode(2);
        TreeNode one2 = new TreeNode(1);
        TreeNode four2 = new TreeNode(4, one2, two2);

        System.out.println(isSubtree(three, four));
    }


    static ArrayList<Boolean> r = new ArrayList<>();
    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }

        if (root.val != subRoot.val) {
            isSubtree(root.left, subRoot);
            isSubtree(root.right, subRoot);
        }

        if (check(root,subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }


    public static boolean check(TreeNode root, TreeNode subroot) {
        if ((root == null && subroot != null) || (root != null && subroot == null)) {
            return false;
        }

        if (root == null) {
            return true;
        }

        if (root.val != subroot.val) {
            return false;
        }

        return check(root.left, subroot.left) && check(root.right, subroot.right);
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