package data_structure.day_7;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        if (head != null) {
            ListNode node = head.next;
            ListNode previous = head;

            while (node != null) {
                if (node.val == val) {
                    previous.next = node.next;
                } else {
                    previous = node;
                }
                node = node.next;
            }
        }

        return head;
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
