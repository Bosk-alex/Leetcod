package data_structure.day_8;

import data_structure.data_classes.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedListTest {

    @Test
    void deleteDuplicatesFiveNodesList() {
        ListNode a15 = new ListNode(3);
        ListNode a14 = new ListNode(3, a15);
        ListNode a13 = new ListNode(2, a14);
        ListNode a12 = new ListNode(1, a13);
        ListNode a11 = new ListNode(1, a12);

        ListNode pointer = new RemoveDuplicatesFromSortedList().deleteDuplicates(a11);

        assertEquals(1, pointer.val);
        assertEquals(2, pointer.next.val);
        assertEquals(3, pointer.next.next.val);
        assertNull(pointer.next.next.next);
    }

    @Test
    void deleteDuplicatesThreeNodesList() {
        ListNode a13 = new ListNode(2);
        ListNode a12 = new ListNode(1, a13);
        ListNode a11 = new ListNode(1, a12);

        ListNode pointer = new RemoveDuplicatesFromSortedList().deleteDuplicates(a11);

        assertEquals(1, pointer.val);
        assertEquals(2, pointer.next.val);
        assertNull(pointer.next.next);
    }

    @Test
    void reverseNullList() {
        ListNode a11 = null;

        ListNode pointer = new RemoveDuplicatesFromSortedList().deleteDuplicates(a11);

        assertNull(pointer);
    }

    @Test
    void reverseOneNodeList() {
        ListNode a11 = new ListNode(1);

        ListNode pointer = new RemoveDuplicatesFromSortedList().deleteDuplicates(a11);

        assertEquals(1, pointer.val);
        assertNull(pointer.next);
    }
}