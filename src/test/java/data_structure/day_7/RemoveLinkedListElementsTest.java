package data_structure.day_7;

import org.junit.jupiter.api.Test;

import static data_structure.day_7.RemoveLinkedListElements.*;
import static org.junit.jupiter.api.Assertions.*;

class RemoveLinkedListElementsTest {

    @Test
    void removeElements() {
/*
        ListNode a17 = new ListNode(6);
        ListNode a16 = new ListNode(5, a17);
        ListNode a15 = new ListNode(4, a16);
        ListNode a14 = new ListNode(3, a15);
        ListNode a13 = new ListNode(6, a14);
        ListNode a12 = new ListNode(2, a13);
        ListNode a11 = new ListNode(1, a12);

        ListNode pointer = new RemoveLinkedListElements().removeElements(a11, 6);

        assertEquals(1, pointer.val);
        assertEquals(2, pointer.next.val);
        assertEquals(3, pointer.next.next.val);
        assertEquals(4, pointer.next.next.next.val);
        assertEquals(5, pointer.next.next.next.next.val);
        assertNull(pointer.next.next.next.next.next);
*/
/*
        ListNode a11 = null;

        ListNode pointer = new RemoveLinkedListElements().removeElements(a11, 1);

        assertNull(pointer);
*/
        ListNode a14 = new ListNode(7);
        ListNode a13 = new ListNode(7, a14);
        ListNode a12 = new ListNode(7, a13);
        ListNode a11 = new ListNode(7, a12);

        ListNode pointer = new RemoveLinkedListElements().removeElements(a11, 7);

        assertNull(pointer);
    }
}