package zb.算法.LeetCode.反转二叉树;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            invertTreeNode(root);
        }
        return root;
    }

    public void invertTreeNode(TreeNode root) {

        if (root != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;

            invertTree(root.left);
            invertTree(root.right);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = new TreeNode(10);
        solution.invertTree(treeNode);
        System.out.println(treeNode);


    }
}
