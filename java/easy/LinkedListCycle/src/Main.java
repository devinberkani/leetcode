import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ListNode e = new ListNode(1);
        ListNode d = new ListNode(1);
        d.next = e;
        ListNode c = new ListNode(1);
        c.next = d;
        ListNode b = new ListNode(1);
        b.next = c;
        ListNode a = new ListNode(1);
        a.next = b;
        e.next = a;

        System.out.println(hasCycle(a));
    }

    public static boolean hasCycle(ListNode head) {
        ArrayList<ListNode> nodes = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            nodes.add(current);
            if (nodes.contains(current.next)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}