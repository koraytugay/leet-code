package biz.tugay.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/symmetric-tree
public class SymmetricTree {

  static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
    }
  }

  public boolean isSymmetric(TreeNode root) {
    Queue<TreeNode> nodesToCompareLeft = new LinkedList<>();
    Queue<TreeNode> nodesToCompareRight = new LinkedList<>();

    nodesToCompareLeft.add(root.left);
    nodesToCompareRight.add(root.right);

    while (true) {
      TreeNode left = nodesToCompareLeft.poll();
      TreeNode right = nodesToCompareRight.poll();

      if (left == null && right == null) {
        break;
      }

      if (left == null || right == null) {
        return false;
      }

      if (left.val != right.val) {
        return false;
      }

      if (left.left != null || right.right != null) {
        nodesToCompareLeft.add(left.left);
        nodesToCompareRight.add(right.right);
      }

      if (left.right != null || right.left != null) {
        nodesToCompareLeft.add(left.right);
        nodesToCompareRight.add(right.left);
      }
    }

    return true;
  }
}
