public class Main {
    public static void main(String[] args) {

        ListNode g = new ListNode(4);
        ListNode f = new ListNode(8);
        f.next = g;

        ListNode e = new ListNode(1);
        e.next = f;
        ListNode d = new ListNode(6);
        d.next = e;
        ListNode c = new ListNode(5);
        c.next = d;

        ListNode b = new ListNode(1);
        b.next = f;
        ListNode a = new ListNode(4);
        a.next = b;

        System.out.println(getIntersectionNode(a,c));
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        ListNode currentB = headB;
        while (currentA != currentB) {
            currentA = currentA == null ? headB : currentA.next;
            currentB = currentB == null ? headA : currentB.next;
        }
        return currentA;
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