/**
 * @author anobis <austin.nobis@amd.com>
 */
public class Problem237 {
   public static void main(String[] args) {

   }

   public static void deleteNode(ListNode node) {
      node.val = node.next.val;
      node.next = node.next.next;
   }
}
