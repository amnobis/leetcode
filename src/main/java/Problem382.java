/**
 * @author anobis
 */
public class Problem382 {
    private final ListNode head;
    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Problem382(ListNode head) {
        this.head = head;
    }

    /** Returns a random node's value. */
    public int getRandom() {
        int random = head.val;
        ListNode tmp = head.next;

        for (int i = 1; tmp != null; tmp = tmp.next) {
            ++i;
            int j = (int) Math.floor(Math.random() * i);
            if (j < 1) {
                random = tmp.val;
            }
        }
        return random;
    }
}
