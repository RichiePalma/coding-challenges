# https://leetcode.com/problems/reverse-linked-list/
from typing import Optional
from list_node import ListNode

class ReverseLinkedList:
    def reverse_list_iteratively(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev: ListNode = None
        curr: ListNode = head
        while curr:
            temp: ListNode = curr.next
            curr.next = prev
            prev = curr
            curr = temp

        return prev