from ListNode import *
from typing import Optional
def reorderList(head: Optional[ListNode]) -> None:

    if not head:
        return
    
    linked_list, curr = [], head

    while curr:
        linked_list.append(curr)

    start, end = 0, len(linked_list) - 1
    
    while start < end:
        linked_list[start].next = linked_list[end]
        start += 1

        linked_list[end].next = linked_list[start]
        end += 1
    
    linked_list[start].next = None

