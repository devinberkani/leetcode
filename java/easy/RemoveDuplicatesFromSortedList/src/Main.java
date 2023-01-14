public class Main {
    public static void main(String[] args) {
        ListNode g = new ListNode(3);
        ListNode f = new ListNode(3, g);
        ListNode e = new ListNode(3, f);
        ListNode d = new ListNode(3, e);
        ListNode c = new ListNode(1, d);
        ListNode b = new ListNode(1, c);
        ListNode a = new ListNode(-1, b);

        ListNode current = deleteDuplicates(a);

        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val != current.next.val) {
                current = current.next;
            } else {
                current.next = current.next.next != null ? current.next.next : null;
            }
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