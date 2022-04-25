package data_structure.day_8;

import org.junit.jupiter.api.Test;

import static data_structure.day_8.ReverseLinkedList.*;
import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {

    @Test
    void reverseFiveNodesList() {
        ListNode a15 = new ListNode(5);
        ListNode a14 = new ListNode(4, a15);
        ListNode a13 = new ListNode(3, a14);
        ListNode a12 = new ListNode(2, a13);
        ListNode a11 = new ListNode(1, a12);

        ListNode pointer = new ReverseLinkedList().reverseList(a11);

        assertEquals(5, pointer.val);
        assertEquals(4, pointer.next.val);
        assertEquals(3, pointer.next.next.val);
        assertEquals(2, pointer.next.next.next.val);
        assertEquals(1, pointer.next.next.next.next.val);
        assertNull(pointer.next.next.next.next.next);
    }

    @Test
    void reverseTwoNodesList() {
        ListNode a12 = new ListNode(2);
        ListNode a11 = new ListNode(1, a12);

        ListNode pointer = new ReverseLinkedList().reverseList(a11);

        assertEquals(2, pointer.val);
        assertEquals(1, pointer.next.val);
        assertNull(pointer.next.next);
    }

    @Test
    void reverseNullList() {
        ListNode a11 = null;

        ListNode pointer = new ReverseLinkedList().reverseList(a11);

        assertNull(pointer);
    }

    @Test
    void reverseOneNodeList() {
        ListNode a11 = new ListNode(1);

        ListNode pointer = new ReverseLinkedList().reverseList(a11);

        assertEquals(1, pointer.val);
        assertNull(pointer.next);
    }
}