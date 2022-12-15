public class Main {
    public static void main(String[] args) {

        ListNode five = new ListNode(5);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2);
        ListNode one = new ListNode(1, two);

        ListNode current = removeNthFromEnd(one, 1);
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }

    }

    static int count;

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        head.next = removeNthFromEnd(head.next, n);
        count++;
        return count != n ? head: head.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}