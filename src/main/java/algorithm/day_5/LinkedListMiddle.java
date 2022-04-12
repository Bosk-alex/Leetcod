package algorithm.day_5;

public class LinkedListMiddle {
    public static void main(String[] args) {
        ListNode l6 = new ListNode(6);
        ListNode l5 = new ListNode(5, l6);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        System.out.println(middleNode(l1).val);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode node = head;
        ListNode x2Node = head;

        while (x2Node != null && x2Node.next != null) {
            node = node.next;
            x2Node = x2Node.next.next;
        }

        return node;
    }
}
