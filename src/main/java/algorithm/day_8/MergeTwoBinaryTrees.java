package algorithm.day_8;

public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        TreeNode newRoot = new TreeNode();
        dfs(root1, root2, newRoot);

        return newRoot;
    }

    private void dfs(TreeNode root1, TreeNode root2, TreeNode newRoot) {
        if (root1 == null && root2 == null) return;

        if (root1 == null) {
            newRoot.val = root2.val;
            if (root2.left != null) {
                newRoot.left = new TreeNode();
                dfs(null, root2.left, newRoot.left);
            }
            if (root2.right != null) {
                newRoot.right = new TreeNode();
                dfs(null, root2.right, newRoot.right);
            }
        } else if (root2 == null) {
            newRoot.val = root1.val;
            if (root1.left != null) {
                newRoot.left = new TreeNode();
                dfs(root1.left, null, newRoot.left);
            }
            if (root1.right != null) {
                newRoot.right = new TreeNode();
                dfs(root1.right, null, newRoot.right);
            }
        } else {
            newRoot.val = root1.val + root2.val;
            if (root1.left != null || root2.left != null) {
                TreeNode left1 = root1.left != null ? root1.left : null;
                TreeNode left2 = root2.left != null ? root2.left : null;
                newRoot.left = new TreeNode();
                dfs(left1, left2, newRoot.left);
            }
            if (root1.right != null || root2.right != null) {
                TreeNode right1 = root1.right != null ? root1.right : null;
                TreeNode right2 = root2.right != null ? root2.right : null;
                newRoot.right = new TreeNode();
                dfs(right1, right2, newRoot.right);
            }
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


