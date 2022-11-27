import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode five = new TreeNode(3);
        TreeNode four = new TreeNode(1);
        TreeNode three = new TreeNode(6);
        TreeNode two = new TreeNode(2, four, five);
        TreeNode one = new TreeNode(4, two, three);
        System.out.println(getMinimumDifference(one));
    }

    public static int getMinimumDifference(TreeNode root) {
        List<Integer> v = new ArrayList<>();
        h(v, root);
        Collections.sort(v);
        int r = Integer.MAX_VALUE;
        for (int i = 1; i < v.size(); i++) {
            r = Math.min(v.get(i) - v.get(i - 1), r);
        }
        return r;
    }

    public static void h (List<Integer> v, TreeNode root) {
        if (root == null) {
            return;
        }
        h(v, root.left);
        v.add(root.val);
        h(v, root.right);
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