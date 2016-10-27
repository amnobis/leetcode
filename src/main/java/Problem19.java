/**
 * @author anobis
 */
public class Problem19 {
    public static void main(String[] args) {

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0, null);
        ListNode fast = start, slow = start;
        slow.next = head;

        for (int i = 0; i < n+1; ++i) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return start.next;
    }
}
