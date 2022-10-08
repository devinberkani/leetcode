import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ListNode c = new ListNode(9);
        ListNode b = new ListNode(8, c);
        ListNode a = new ListNode(0);

        ListNode f = new ListNode(4);
        ListNode e = new ListNode(3, f);
        ListNode d = new ListNode(0);

        ListNode current = mergeTwoLists(a, d);
        while (current != null) {
            System.out.println(current.val);
            current = current.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ArrayList<Integer> numbers = new ArrayList<>();

        ListNode current = list1;

        if (list1 != null) {
            while (current != null) {
                numbers.add(current.val);
                current = current.next;
            }
        }

        current = list2;

        if (list2 != null) {
            while (current != null) {
                numbers.add(current.val);
                current = current.next;
            }
        }

        if (numbers.size() == 0) {
            return null;
        }

        Collections.sort(numbers);

        ListNode head = new ListNode(numbers.get(0));
        ListNode currentNode = head;

        for (int i = 1; i < numbers.size(); i++) {
            currentNode.next = new ListNode(numbers.get(i));
            currentNode = currentNode.next;
        }

        return head;

    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {

      }
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
  }