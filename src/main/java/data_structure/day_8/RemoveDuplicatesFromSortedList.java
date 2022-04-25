package data_structure.day_8;

import data_structure.data_classes.ListNode;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head != null && head.next != null) {
            ListNode pointer = head;
            while (pointer.next != null) {
                if (pointer.val == pointer.next.val) {
                    pointer.next = pointer.next.next;
                } else {
                    pointer = pointer.next;
                }
            }
        }

        return head;
    }
}
