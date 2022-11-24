public class Main {
    public static void main(String[] args) {

        ListNode seven = new ListNode(9);
        ListNode six = new ListNode(9, seven);
        ListNode five = new ListNode(9, six);
        ListNode four = new ListNode(9, five);
        ListNode three = new ListNode(9);
        ListNode two = new ListNode(9, three);
        ListNode one = new ListNode(9, two);

        ListNode eleven = new ListNode(9);
        ListNode ten = new ListNode(9);
        ListNode nine = new ListNode(9, ten);
        ListNode eight = new ListNode(9, nine);

        ListNode c = addTwoNumbers(eight, one);
        while (c != null) {
            System.out.println(c.val);
            c = c.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int t = l1.val;
        int b = l2.val;
        int r = (t + b) / 10;
        ListNode head = new ListNode((t + b) % 10);
        ListNode c = head;
        ListNode z = new ListNode(0);
        while (c != null) {
            l1 = l1.next == null ? z : l1.next;
            l2 = l2.next == null ? z : l2.next;
            t = l1.val;
            b = l2.val;
            ListNode n = new ListNode((t + b + r) % 10);
            c.next = l1 == z && l2 == z && r == 0 ? null : n;
            c = c.next;
            r = (t + b + r) / 10;
        }
        return head;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }