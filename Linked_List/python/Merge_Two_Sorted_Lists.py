from ListNode import ListNode
from typing import Optional
import pytest

def mergeTwoLists(list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
    
    if not list1 and not list2:
        return
    
    if not list1:
        return list2
    
    if not list2:
        return list1
    
    mergedList = None

    if list1.val <= list2.val:
        mergedList = list1
        list1 = list1.next
    else:
        mergedList = list2
        list2 = list2.next

    curr = mergedList
    while (list1 and list2):

        if (list1.val <= list2.val):
            curr.next = list1
            list1 = list1.next
        else: 
            curr.next = list2
            list2 = list2.next
        
        curr = curr.next

    # Edge case that both lists are not equal
    if (list1):
        curr.next = list1
    if (list2):
        curr.next = list2

    return mergedList



# Tests 

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



# class TestMergetwolists:

#     # merging two non-empty lists with interleaved elements
#     def test_merge_interleaved_lists(self):
#         list1 = ListNode(1, ListNode(3, ListNode(5)))
#         list2 = ListNode(2, ListNode(4, ListNode(6)))
#         merged = mergeTwoLists(list1, list2)
#         result = []
#         while merged:
#             result.append(merged.val)
#             merged = merged.next
#         assert result == [1, 2, 3, 4, 5, 6]

#     # merging two empty lists
#     def test_merge_empty_lists(self):
#         list1 = None
#         list2 = None
#         merged = mergeTwoLists(list1, list2)
#         assert merged is None