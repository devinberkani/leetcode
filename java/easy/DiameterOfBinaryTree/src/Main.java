public class Main {
    public static void main(String[] args) {

        TreeNode five = new TreeNode(5);
        TreeNode four = new TreeNode(4);
        TreeNode three = new TreeNode(3);
        TreeNode two = new TreeNode(2);
        TreeNode one = new TreeNode(1, two, null);

        System.out.println(diameterOfBinaryTree(one));
    }

    static int d;
    public static int diameterOfBinaryTree(TreeNode root) {
        d = 0;
        h(root);
        return d;
    }

    public static int h(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = h(root.left);
        int r = h(root.right);
        d = Math.max(d, l + r);
        return Math.max(l, r) + 1;
    }
// alternative less optimal solution
//    public static int diameterOfBinaryTree(TreeNode root) {
//        if (root == null) return 0;
//        int l = diameterOfBinaryTree(root.left);
//        int r = diameterOfBinaryTree(root.right);
//        int c = h(root.left) + h(root.right);
//        return Math.max(c, Math.max(l,r));
//    }
//
//    public static int h(TreeNode root) {
//        if (root == null) return 0;
//        return 1 + Math.max(h(root.left),h(root.right));
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