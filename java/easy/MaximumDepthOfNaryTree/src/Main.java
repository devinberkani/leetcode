import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static int maxDepth(Node root) {
        if (root == null) return 0;
        int r = 0;
        for (Node n : root.children) {
            r = Math.max(r, maxDepth(n));
        }
        return 1 + r;
    }

}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};