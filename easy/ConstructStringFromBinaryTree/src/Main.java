public class Main {
    public static void main(String[] args) {

        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode two = new TreeNode(2, four, null);
        TreeNode one = new TreeNode(1, two, three);

        System.out.println(tree2str(one));
    }

    public static String tree2str(TreeNode root) {
        return h(root);
    }

    public static String h (TreeNode root) {
        if (root == null) {
            return "()";
        }

        String l = h(root.left);
        String r = h(root.right);

        if (l.equals("()") && r.equals("()")) return Integer.toString(root.val);
        if (!l.equals("()") && r.equals("()")) return root.val + "(" + l + ")";
        if (l.equals("()")) return root.val + l + "(" + r + ")";
        else return root.val + "(" + l + ")(" + r + ")";
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
        this.val = val;
    }
}