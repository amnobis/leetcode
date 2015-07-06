class Problem203:
    # @param {ListNode} head
    # @param {integer} val
    # @return {ListNode}
    def removeElements(self, head, val):
        if head is None:
            return head

        while head is not None and head.val == val:
            head = head.next
        
        store = head
        tmp = head
        
        while head is not None:
            head = head.next
            if head is not None and head.val == val:
                tmp.next = head.next
                head = tmp
            else:
                tmp = head
            
        return store