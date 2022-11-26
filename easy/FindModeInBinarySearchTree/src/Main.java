import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TreeNode three = new TreeNode(2);
        TreeNode two = new TreeNode(2, three, null);
        TreeNode one = new TreeNode(0);
        System.out.println(Arrays.toString(findMode(one)));
    }

    public static int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> e = new HashMap<>();
        h(e, root);
        int m = 0;
        for (Map.Entry<Integer, Integer> i : e.entrySet()) {
            if (i.getValue() > m) {
                m = i.getValue();
            }
        }
        int c = 0;
        for (Map.Entry<Integer, Integer> i : e.entrySet()) {
            if (i.getValue() == m) {
                c++;
            }
        }
        int[] r = new int[c];
        int j = 0;
        for (Map.Entry<Integer, Integer> i : e.entrySet()) {
            if (i.getValue() == m) {
                r[j] = i.getKey();
                j++;
            }
        }
        return r;
    }

    public static void h (HashMap<Integer, Integer> e, TreeNode root) {
        if (root == null) {
            return;
        }

        h(e, root.left);
        if (!e.containsKey(root.val)) {
            e.put(root.val, 1);
        } else {
            e.put(root.val, e.get(root.val) + 1);
        }
        h(e, root.right);
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