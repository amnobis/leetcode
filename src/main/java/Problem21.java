/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem21 {
   public static void main(String[] args) {

   }

   public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      if (l1 == null) {
         return l2;
      }

      if (l2 == null) {
         return l1;
      }
      ListNode l3;

      if (l1.val < l2.val) {
         l3 = l1;
         l1 = l1.next;
         l3.next = null;
      } else {
         l3 = l2;
         l2 = l2.next;
         l3.next = null;
      }
      ListNode head = l3;

      while (l1 != null || l2 != null) {
         if (l1 == null) {
            l3.next = l2;
            l2 = null;
         } else if (l2 == null) {
            l3.next = l1;
            l1 = null;
         } else {
            ListNode tmp;

            if (l1.val < l2.val) {
               tmp = l1;
               l1 = l1.next;
               tmp.next = null;
               l3.next = tmp;
            } else {
               tmp = l2;
               l2 = l2.next;
               tmp.next = null;
               l3.next = tmp;
            }
            l3 = l3.next;
         }
      }
      return head;
   }
}
