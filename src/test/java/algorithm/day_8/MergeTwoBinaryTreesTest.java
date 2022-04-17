package algorithm.day_8;

import algorithm.day_8.MergeTwoBinaryTrees.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoBinaryTreesTest {

    @Test
    void mergeTreesNullTest() {
        TreeNode tn = new TreeNode();
//        tn.left = new MergeTwoBinaryTrees().new TreeNode();
        assertNull(tn.left);
    }

    @Test
    void mergeTreesTest() {
        TreeNode a111 = new TreeNode(5);
        TreeNode a11 = new TreeNode(3, a111, null);
        TreeNode a12 = new TreeNode(2);
        TreeNode a1 = new TreeNode(1, a11, a12);

        TreeNode b112 = new TreeNode(4);
        TreeNode b122 = new TreeNode(7);
        TreeNode b11 = new TreeNode(1, null, b112);
        TreeNode b12 = new TreeNode(3, null, b122);
        TreeNode b1 = new TreeNode(2, b11, b12);

/*
        TreeNode a1 = new TreeNode(1);

        TreeNode b11 = new TreeNode(2);
        TreeNode b1 = new TreeNode(1, b11, null);

*/
        TreeNode c1 = new MergeTwoBinaryTrees().mergeTrees(a1, b1);

        int[] val = new int[7];
        val[0] = c1 == null ? 0 : c1.val;
        val[1] = (c1 == null || c1.left == null) ? 0 : c1.left.val;
        val[2] = (c1 == null || c1.right == null) ? 0 : c1.right.val;
        val[3] = (c1 == null || c1.left == null || c1.left.left == null) ? 0 : c1.left.left.val;
        val[4] = (c1 == null || c1.left == null || c1.left.right == null) ? 0 : c1.left.right.val;
        val[5] = (c1 == null || c1.right == null || c1.right.left == null) ? 0 : c1.right.left.val;
        val[6] = (c1 == null || c1.right == null || c1.right.right == null) ? 0 : c1.right.right.val;

        int[] expected = {3, 4, 5, 5, 4, 0, 7};

/*
        int[] val = new int[3];
        val[0] = c1 == null ? 0 : c1.val;
        val[1] = (c1 == null || c1.left == null) ? 0 : c1.left.val;
        val[2] = (c1 == null || c1.right == null) ? 0 : c1.right.val;

        int[] expected = {2, 2, 0};

*/
        assertArrayEquals(expected, val);
    }
}