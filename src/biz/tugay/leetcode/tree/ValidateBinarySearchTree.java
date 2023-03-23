package biz.tugay.leetcode.tree;

// https://leetcode.com/problems/validate-binary-search-tree
public class ValidateBinarySearchTree {

  static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
    }
  }

  public boolean isValidBST(TreeNode root) {
    return isValidHelper(root, null, null);
  }

  public boolean isValidHelper(TreeNode node, TreeNode min, TreeNode max) {
    if (node == null) {
      return true;
    }

    if (min != null && node.val <= min.val ||
        max != null && node.val >= max.val) {
      return false;
    }

    return isValidHelper(node.left, min, node) && isValidHelper(node.right, node, max);
  }
}