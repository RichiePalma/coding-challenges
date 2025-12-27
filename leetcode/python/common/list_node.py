# Definition for singly-linked list.
from __future__ import annotations
from typing import Optional, List

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
    def __eq__(self, other):
        if not isinstance(other, ListNode):
            return NotImplemented

        return self.val == other.val and self.next == other.next

    @classmethod
    def list_to_node(cls,vals: List[int]) -> Optional[ListNode]:
        if not vals:
            return None
        head = cls(vals[0])
        cur = head
        for v in vals[1:]:
            cur.next = cls(v)
            cur = cur.next

        return head