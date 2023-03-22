package biz.tugay.leetcode.tree;

// https://leetcode.com/problems/maximum-depth-of-binary-tree
public class MaximumDepthOfBinaryTree {

  static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
    }
  }

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }

    int depthLeft = 1 + maxDepth(root.left);
    int depthRight = 1 + maxDepth(root.right);

    if (depthLeft > depthRight) {
      return depthLeft;
    }

    return depthRight;
  }
}
