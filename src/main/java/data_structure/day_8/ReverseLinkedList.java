package data_structure.day_8;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head != null && head.next != null) {
            ListNode previous = null;
            ListNode current = head;
            ListNode node = current;

            while (node.next != null) {
                node = node.next;
                current.next = previous;
                previous = current;
                current = node;
            }
            current.next = previous;
            head = current;
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this(val, null);
        }

        public ListNode(int val, ListNode node) {
            this.val = val;
            next = node;
        }
    }
}
