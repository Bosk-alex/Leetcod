package data_structure.day_7;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head;

        if (list1 == null) {
            head = list2;
        } else if (list2 == null) {
            head = list1;
        } else {
            ListNode pointer1 = list1;
            ListNode pointer2 = list2;

            if (list1.val < list2.val) {
                head = list1;
                pointer1 = pointer1.next;
            } else {
                head = list2;
                pointer2 = pointer2.next;
            }
            ListNode pointer3 = head;

            while (true) {
                if (pointer1 == null || pointer2 == null) {
                    pointer3.next = setPointerIfNull(pointer1, pointer2);
                    break;
                } else if (pointer1.val < pointer2.val) {
                    pointer3.next = pointer1;
                    pointer1 = pointer1.next;
                    pointer3 = pointer3.next;
                } else {
                    pointer3.next = pointer2;
                    pointer2 = pointer2.next;
                    pointer3 = pointer3.next;
                }
            }
        }

        return head;
    }

    private ListNode setPointerIfNull(ListNode pointer1, ListNode pointer2) {
        return pointer1 == null ? pointer2 : pointer1;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
            this(0);
        }

        ListNode(int val) {
            this(val, null);
        }

        public ListNode(int val, ListNode node) {
            this.val = val;
            next = node;
        }
    }

}
