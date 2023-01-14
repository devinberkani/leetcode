public class Main {
    public static void main(String[] args) {

        ListNode six3 = new ListNode(7);
        ListNode six2 = new ListNode(6, six3);
        ListNode six1 = new ListNode(6, six2);
        ListNode six = new ListNode(6,six1);

        ListNode current = removeElements(six, 6);
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }

        while (head.val == val) {
            head = head.next;
            if (head == null) {
                return null;
            }
        }

        ListNode current = head.next;
        ListNode previous = head;
        while (current != null) {
            if (current.val != val) {
                previous.next = current;
                previous = current;
            } else {
                previous.next = current.next;
            }
            current = current.next;
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