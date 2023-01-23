import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        ListNode five = new ListNode(5);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(1, two);

        ListNode r = rotateRight(null, 2);
        while (r != null) {
            System.out.println(r.val);
            r = r.next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        List<Integer> values = new ArrayList<>();
        int length = 0;
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            length++;
            current = current.next;
        }

        k %= length;
        if (k == 0) return head;

        int count = 0;
        current = head;
        int i = length - k;
        while (count < length) {
            int currVal = values.get(i);
            current.val = currVal;
            if (++i > length - 1) i = 0;
            current = current.next;
            count++;
        }
        return head;
    }

    // traverse to end of listnode to get length
    // number of actual rotations will be: 
        // if k == length - return the listnode
        // else k = k % length
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}