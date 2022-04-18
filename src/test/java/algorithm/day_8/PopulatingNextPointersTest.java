package algorithm.day_8;

import algorithm.day_8.PopulatingNextPointers.Node;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PopulatingNextPointersTest {

    @Test
    void connectTest() {
        Node a122 = new Node(7);
        Node a121 = new Node(6);
        Node a112 = new Node(5);
        Node a111 = new Node(4);
        Node a12 = new Node(3, a121, a122, null);
        Node a11 = new Node(2, a111, a112, null);
        Node a1 = new Node(1, a11, a12, null);

        new PopulatingNextPointers().connect(a1);

        Integer[] val = new Integer[10];
        val[0] = a1 == null ? null : a1.val;
        val[1] = (a1 == null || a1.next == null) ? null : a1.next.val;

        val[2] = (a1 == null || a1.left == null) ? null : a1.left.val;
        val[3] = (a1 == null || a1.left == null || a1.left.next == null) ? null : a1.left.next.val;
        val[4] = (a1 == null || a1.left == null || a1.left.next == null || a1.left.next.next == null) ? null : a1.left.next.next.val;

        val[5] = (a1 == null || a1.left == null || a1.left.left == null) ? null : a1.left.left.val;
        val[6] = (a1 == null || a1.left == null || a1.left.left == null || a1.left.left.next == null) ? null : a1.left.left.next.val;
        val[7] = (a1 == null || a1.left == null || a1.left.left == null || a1.left.left.next == null || a1.left.left.next.next == null) ? null : a1.left.left.next.next.val;
        val[8] = (a1 == null || a1.left == null || a1.left.left == null || a1.left.left.next == null || a1.left.left.next.next == null || a1.left.left.next.next.next == null) ? null : a1.left.left.next.next.next.val;
        val[9] = (a1 == null || a1.left == null || a1.left.left == null || a1.left.left.next == null || a1.left.left.next.next == null || a1.left.left.next.next.next == null || a1.left.left.next.next.next.next == null) ? null : a1.left.left.next.next.next.next.val;

        Integer[] expected = {1, null, 2, 3, null, 4, 5, 6, 7, null};

        assertArrayEquals(expected, val);
    }
}