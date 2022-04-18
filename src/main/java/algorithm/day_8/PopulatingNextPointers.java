package algorithm.day_8;

import java.util.ArrayList;
import java.util.List;

public class PopulatingNextPointers {
    public Node connect(Node root) {
        if (root != null) {
            ArrayList<Node> nodes = new ArrayList<>(List.of(root));
            bfs(nodes);
        }

        return root;
    }

    private void bfs(ArrayList<Node> nodes) {
        for (int i = 0; i < nodes.size() - 1; i++) {
            nodes.get(i).next = nodes.get(i + 1);
        }

        if (nodes.get(0).left != null) {
            ArrayList<Node> newNodes = new ArrayList<>();
            for (Node node :
                    nodes) {
                    newNodes.add(node.left);
                    newNodes.add(node.right);
            }
            bfs(newNodes);
        }
    }

    static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node left, Node right, Node next) {
            this.val = val;
            this.left = left;
            this.right = right;
            this.next = next;
        }
    }
}
