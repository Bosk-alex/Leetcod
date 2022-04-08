package Algorithm.Day5;

public class RemoveNthNodeFromList {
    public static void main(String[] args) {
        ListNode l6 = new ListNode(6, null);
        ListNode l5 = new ListNode(5, l6);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        int n = 6;

        ListNode node = l1;
        while (node != null) {
            System.out.print(node.val + ", ");
            node = node.next;
        }
        System.out.println("\n" + n);

        node = removeNthFromEnd(l1, n);
        while (node != null) {
            System.out.print(node.val + ", ");
            node = node.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next != null) {
            ListNode node = head;
            ListNode endNode = head;

            for (int i = 0; i < n; i++) {
                endNode = endNode.next;
            }

            while (endNode != null && endNode.next != null) {
                node = node.next;
                endNode = endNode.next;
            }

            if (endNode != null) {
                node.next = node.next.next;
            } else {
                head = node.next;
            }

            return head;

        }
        return null;
    }
}