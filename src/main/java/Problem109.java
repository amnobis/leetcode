/**
 * @author anobis
 */
public class Problem109 {
    public static void main(String[] args) {

    }

    public static TreeNode sortListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        return toBST(head, null);
    }

    public static TreeNode toBST(ListNode head, ListNode tail) {
        ListNode fast = head;
        ListNode slow = head;

        if (head == tail) {
            return null;
        }

        while (fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode node = new TreeNode(null, null, slow.val);
        node.left = toBST(head, slow);
        node.right = toBST(slow.next, tail);
        return node;
    }
}
