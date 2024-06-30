import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

class Reverse_Linked_List_Test {

	public Reverse_Linked_List solution;
	
	@BeforeEach
	public void setup() {
		solution = new Reverse_Linked_List();
	}

	// reverses a list with multiple elements
    @Test
	@DisplayName("Testing list with multiple nodes")
    public void test_reverse_list_with_multiple_elements() {
        Reverse_Linked_List reverseLinkedList = new Reverse_Linked_List();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reversedHead = reverseLinkedList.reverseList(head);

        assertEquals(5, reversedHead.val);
        assertEquals(4, reversedHead.next.val);
        assertEquals(3, reversedHead.next.next.val);
        assertEquals(2, reversedHead.next.next.next.val);
        assertEquals(1, reversedHead.next.next.next.next.val);
        assertNull(reversedHead.next.next.next.next.next);
    }
	// handles an empty list (null head)
    @Test
	@DisplayName("Testing for empty list")
    public void test_reverse_empty_list() {
        Reverse_Linked_List reverseLinkedList = new Reverse_Linked_List();
        ListNode head = null;

        ListNode reversedHead = reverseLinkedList.reverseList(head);

        assertNull(reversedHead);
    }
}

