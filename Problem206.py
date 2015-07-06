# Definition for singly-linked list.
# class ListNode:
#    def __init__(self, x):
#        self.val = x
#        self.next = None

class Problem206:
    # @param {ListNode} head
    # @return {ListNode}
    def reverseList(self, head):
        if head is None:
            return head
        
        tmp = None
        while head is not None:
            out = head
            head = head.next
            out.next = tmp
            tmp = out
        
        return out