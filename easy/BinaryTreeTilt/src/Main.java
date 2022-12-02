
public class Main {
    public static void main(String[] args) {

//        TreeNode seven = new TreeNode(7);
//        TreeNode nine = new TreeNode(9, null, seven);
//        TreeNode five = new TreeNode(5);
//        TreeNode three = new TreeNode(3);
//        TreeNode two = new TreeNode(2, three, five);
//        TreeNode four = new TreeNode(4, two, nine);


        TreeNode two = new TreeNode(2);
        TreeNode twoR = new TreeNode(2);
        TreeNode fourteen = new TreeNode(14, two, twoR);
        TreeNode three = new TreeNode(3);
        TreeNode threeR = new TreeNode(3);
        TreeNode one = new TreeNode(1, three, threeR);
        TreeNode oneR = new TreeNode(1);
        TreeNode seven = new TreeNode(7, one, oneR);
        TreeNode twentyone = new TreeNode(21, seven, fourteen);

        System.out.println(findTilt(twentyone));
    }

    static int sum;
    public static int findTilt(TreeNode root) {
        sum = 0;
        h(root);
        return sum;
    }

    public static void h(TreeNode root) {
        if (root == null) {
            return;
        }
        sum += Math.abs(sum(root.left) - sum(root.right));
        h(root.left);
        h(root.right);
    }

    public static int sum (TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
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
