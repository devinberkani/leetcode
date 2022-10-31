public class Main {
    public static void main(String[] args) {

        ListNode five = new ListNode(5);
        ListNode four = new ListNode(4, five);
        ListNode three = new ListNode(3, four);
        ListNode two = new ListNode(2, three);
        ListNode one = new ListNode(1);

        ListNode result = reverseList(one);
        System.out.println(result);
//        while (result != null) {
//            System.out.println(result.val);
//            result = result.next;
//        }
    }

    public static ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode previous = head;
        ListNode current = head.next;
        while (current.next != null) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head.next = null;
        current.next = previous;

        return current;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }