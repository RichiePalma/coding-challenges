import pytest
from reverse_linked_list import ReverseLinkedList
from list_node import ListNode

@pytest.mark.parametrize(
    "head,expected",
    [
        (ListNode.list_to_node([]), ListNode.list_to_node([])),
        (ListNode.list_to_node([1, 2, 3, 4, 5]), ListNode.list_to_node([5, 4, 3, 2, 1])),
        (ListNode.list_to_node([1, 2]), ListNode.list_to_node([2, 1])),
        (ListNode.list_to_node([1]), ListNode.list_to_node([1])),
        (ListNode.list_to_node([1000,40,3111,4999,1,-4999]), ListNode.list_to_node([-4999,1,4999,3111,40,1000])),
    ],
)

def test_reverse_list_iteratively(head: ListNode, expected: ListNode):
    rll = ReverseLinkedList()
    assert rll.reverse_list_iteratively(head) == expected
