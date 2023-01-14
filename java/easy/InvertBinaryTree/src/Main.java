import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TreeNode nine = new TreeNode(9);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7, six, nine);
        TreeNode three = new TreeNode(3);
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2, one, three);
        TreeNode four = new TreeNode(4, two, seven);

        System.out.println("This is the original: " + traversal(four));

        TreeNode inverted = invertTree(four);
        System.out.println("This is inverted: " + traversal(inverted));


    }

    public static TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode right = root.right;
        TreeNode left = root.left;
        root.right = invertTree(left);
        root.left = invertTree(right);

        return root;

    }

    public static List<Integer> traversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    public static void helper(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        helper(root.left, result);
        result.add(root.val);
        helper(root.right, result);

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