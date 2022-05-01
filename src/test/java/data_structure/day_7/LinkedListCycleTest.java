package data_structure.day_7;

import org.junit.jupiter.api.Test;

import static data_structure.day_7.LinkedListCycle.*;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {

    @Test
    void hasCycle() {
        ListNode n14 = new ListNode(-4);
        ListNode n13 = new ListNode(0, n14);
        ListNode n12 = new ListNode(2, n13);
        ListNode n11 = new ListNode(3, n12);
        n14.next = n12;

        ListNode n22 = new ListNode(2);
        ListNode n21 = new ListNode(1, n22);
        n22.next = n21;

        ListNode n31 = new ListNode(1);

        assertTrue(new LinkedListCycle().hasCycle(n11));
        assertTrue(new LinkedListCycle().hasCycle(n21));
        assertFalse(new LinkedListCycle().hasCycle(n31));
        assertFalse(new LinkedListCycle().hasCycle(null));
    }
}