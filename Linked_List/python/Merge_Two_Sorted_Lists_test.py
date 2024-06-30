# # Tests
# from ListNode import ListNode
# from Merge_Two_Sorted_Lists import mergeTwoLists
# import pytest

# list1 = ListNode(1, ListNode(2, ListNode(4)))
# list2 = ListNode(1, ListNode(3, ListNode(4)))

# merged = mergeTwoLists(list1, list2)
# result = []
# while(merged):
#     result.append(merged.val)
#     merged = merged.next

# assert result == [1, 1, 2, 3, 4, 4]

# list1, list2 = None, None
# merged = mergeTwoLists(list1, list2)
# result = []
# if merged is None:
#     result = []
# else:
#     result = [1, 2, 3]

# assert result == []

# list1, list2 = None, ListNode(0)
# merged = mergeTwoLists(list1, list2)
# result = []
# while (merged):
#     result.append(merged.val)
#     merged = merged.next

# assert result == [0]

import pytest
from typing import Optional
from ListNode import ListNode
from Merge_Two_Sorted_Lists import mergeTwoLists

def list_to_array(node: Optional[ListNode]) -> list:
    result = []
    while node:
        result.append(node.val)
        node = node.next
    return result

def test_merge_two_non_empty_lists():
    list1 = ListNode(1, ListNode(2, ListNode(4)))
    list2 = ListNode(1, ListNode(3, ListNode(4)))
    merged = mergeTwoLists(list1, list2)
    result = list_to_array(merged)
    assert result == [1, 1, 2, 3, 4, 4]

def test_merge_two_empty_lists():
    list1, list2 = None, None
    merged = mergeTwoLists(list1, list2)
    result = list_to_array(merged)
    assert result == []

def test_merge_one_empty_one_non_empty_list():
    list1, list2 = None, ListNode(0)
    merged = mergeTwoLists(list1, list2)
    result = list_to_array(merged)
    assert result == [0]

def test_merge_interleaved_lists():
    list1 = ListNode(1, ListNode(3, ListNode(5)))
    list2 = ListNode(2, ListNode(4, ListNode(6)))
    merged = mergeTwoLists(list1, list2)
    result = list_to_array(merged)
    assert result == [1, 2, 3, 4, 5, 6]
