
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Node four = new Node(4);
        Node two = new Node(2);
        Node six = new Node(6);
        Node five = new Node(5);
        List<Node> c2 = new ArrayList<>();
        c2.add(five);
        c2.add(six);
        Node three = new Node(3, c2);
        List<Node> c1 = new ArrayList<>();
        c1.add(three);
        c1.add(two);
        c1.add(four);
        Node one = new Node(1, c1);

        System.out.println(preorder(one));
    }

    public static List<Integer> preorder(Node root) {
        List<Integer> r = new ArrayList<>();
        traversal(root, r);
        return r;
    }

    public static void traversal(Node root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        if (root.children == null) return;
        for (Node r : root.children) {
            traversal(r, result);
        }
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
}