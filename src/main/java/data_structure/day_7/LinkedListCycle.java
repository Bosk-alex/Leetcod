package data_structure.day_7;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        boolean hasCycle = false;

        if (head != null && head.next != null) {
            Set<ListNode> nodeSet = new HashSet<>();
            ListNode node = head;

            while (node.next != null) {
                if (nodeSet.add(node)) {
                    node = node.next;
                } else {
                    hasCycle = true;
                    break;
                }

            }
        }

        return hasCycle;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this(x, null);
        }

        public ListNode(int x, ListNode node) {
            val = x;
            next = node;
        }
    }
}
