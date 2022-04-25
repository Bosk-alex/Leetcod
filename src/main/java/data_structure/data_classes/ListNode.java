package data_structure.data_classes;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this(val, null);
    }

    public ListNode(int val, ListNode node) {
        this.val = val;
        this.next = node;
    }
}
