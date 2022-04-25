package data_structure.day_7;

import org.junit.jupiter.api.Test;

import static data_structure.day_7.MergeTwoSortedLists.*;
import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {

    @Test
    void mergeTwoLists() {
        ListNode a13 = new ListNode(15);
        ListNode a12 = new ListNode(10, a13);
        ListNode a11 = new ListNode(1, a12);

        ListNode a23 = new ListNode(25);
        ListNode a22 = new ListNode(20, a23);
        ListNode a21 = new ListNode(2, a22);

        ListNode pointer = new MergeTwoSortedLists().mergeTwoLists(a11, a21);

        assertEquals(pointer.val, 1);
        assertEquals(pointer.next.val, 2);
        assertEquals(pointer.next.next.val, 10);
        assertEquals(pointer.next.next.next.val, 15);
        assertEquals(pointer.next.next.next.next.val, 20);
        assertEquals(pointer.next.next.next.next.next.val, 25);
        assertNull(pointer.next.next.next.next.next.next);

/*
        while (pointer != null) {
            System.out.println(pointer.val);
            pointer = pointer.next;
        }
*/
    }
}