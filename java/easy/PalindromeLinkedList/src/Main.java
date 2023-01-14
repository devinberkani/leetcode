public class Main {
    public static void main(String[] args) {

        ListNode four = new ListNode(1);
        ListNode three = new ListNode(0);
        ListNode two = new ListNode(0, three);
        ListNode one = new ListNode(0, two);
        System.out.println(isPalindrome(one));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode current = head;
        StringBuilder result = new StringBuilder();
        while (current != null) {
            result.append(current.val);
            current = current.next;
        }
        return result.toString().equals(result.reverse().toString());
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}