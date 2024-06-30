import java.util.Stack;

/**
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:

Input: head = [1,2]
Output: [2,1]

Example 3:

Input: head = []
Output: []
*/


public class Reverse_Linked_List {
    /**
     * Reverses a singly linked list.
     * 
     * @param head the head of the linked list to be reversed
     * @return the head of the reversed linked list
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;
        while (curr != null) {
            stack.add(curr);
            curr = curr.next;
        }

        head = stack.pop();
        curr = head;

        while (!stack.empty()) {
            ListNode temp = stack.pop();
            curr.next = temp;
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

}


/**
Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
 */