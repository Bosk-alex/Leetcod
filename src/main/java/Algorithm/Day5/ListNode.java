package Algorithm.Day5;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
        new ListNode(0);
    }

    ListNode(int val) {
        new ListNode(val, null);
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
