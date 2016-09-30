/*
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem141 {
   public static void main(String[] args) {

   }

   public static boolean hasCycle(ListNode head) {
      if (head == null || head.next == null) {
         return false;
      }
      ListNode n1 = head.next;
      ListNode n2 = head.next.next;

      while (n2 != null && n2.next != null && n1 != n2) {
         n1 = n1.next;
         n2 = n2.next.next;
      }
      if (n2 == null || n2.next == null) {
         return false;
      }
      return true;
   }
}
