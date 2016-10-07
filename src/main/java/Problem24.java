/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem24 {
   public static void main(String[] args) {

   }

   public static ListNode swapPairs(ListNode head) {
      ListNode tmp = head;

      if (head == null) {
         return head;
      }

      while (head != null && head.next != null) {
         int val = head.val;

         head.val = head.next.val;
         head.next.val = val;
         head = head.next.next;
      }
      return tmp;
   }
}
