/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem83 {
   public static void main(String[] args) {

   }

   public static ListNode deleteDuplicates(ListNode head) {
      if (head == null || head.next == null) {
         return head;
      }
      ListNode front = head;

      while (front != null && front.next != null) {
         ListNode tmp = front.next;

         while (tmp != null && front.val == tmp.val) {
            tmp = tmp.next;
         }
         front.next = tmp;
         front = front.next;
      }
      return head;
   }
}
