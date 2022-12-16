public class Main {
    public static void main(String[] args) {

        ListNode seven = new ListNode(7);
        ListNode six = new ListNode(6);
        ListNode five = new ListNode(5);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(1, two);
        ListNode r = swapPairs(one);
        while (r != null) {
            System.out.println(r.val);
            r = r.next;
        }
    }

    // 2 1 3

    public static ListNode swapPairs(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode r = head.next;
        ListNode first = head;
        ListNode second = first.next;
        ListNode saved;
        ListNode connection = new ListNode();
        while (first != null && second != null) {
            saved = second.next == null ? null : second.next; // 3 | null
            System.out.println("saved is " + (saved == null ? "null" : saved.val));
            second.next = first; // 2 -> 1 | 4 -> 3
            System.out.println("second.next is " + second.next.val);
            connection = first; // 1 | 3
            System.out.println("connection is " + connection.val);
            second = saved == null ? null : saved.next; // 4 || null
            System.out.println("second is " + (second == null ? "null" : second.val));
            connection.next = second; // 1 -> 4 | 3 -> null
            System.out.println("connection.next is " + (connection.next == null ? "null" : connection.next.val));
            first = saved; // 3 | null
            System.out.println("first is " + (first == null? "null" : first.val));
        }
        if (first != null) connection.next = first;
        return r;
    }
    // 2, 1
    //

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}