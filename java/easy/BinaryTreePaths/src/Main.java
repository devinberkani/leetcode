import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TreeNode three = new TreeNode(3);
        TreeNode five = new TreeNode(5);
        TreeNode two = new TreeNode(2, null, five);
        TreeNode one = new TreeNode(1, two, three);

        System.out.println(binaryTreePaths(one));
    }

    public static List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();
        String currentPath = "";
        helper(root, currentPath, result);
        return result;

    }

    public static void helper(TreeNode root, String currentPath, List<String> result) {

        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            result.add(currentPath + root.val);
            return;
        }

        helper(root.left, currentPath + root.val + "->", result);
        helper(root.right, currentPath + root.val + "->", result);

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