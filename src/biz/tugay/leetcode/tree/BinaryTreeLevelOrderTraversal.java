package biz.tugay.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/binary-tree-level-order-traversal
public class BinaryTreeLevelOrderTraversal {

  static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
    }
  }

  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> traversal = new ArrayList<>();

    if (root == null) {
      return traversal;
    }

    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      List<Integer> values = new ArrayList<>();
      List<TreeNode> newNodes = new ArrayList<>();
      while (!queue.isEmpty()) {
        TreeNode poll = queue.poll();
        if (poll != null) {
          values.add(poll.val);
          if (poll.left != null) {
            newNodes.add(poll.left);
          }
          if (poll.right != null) {
            newNodes.add(poll.right);
          }
        }
      }
      traversal.add(values);
      if (!newNodes.isEmpty()) {
        queue.addAll(newNodes);
        newNodes.clear();
      }
    }

    return traversal;
  }
}
