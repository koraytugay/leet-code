package biz.tugay.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

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

//  Alternative solution
//  public boolean isValidBST(TreeNode root) {
//    List<TreeNode> treeNodes = inOrderTraverse(root);
//    for (int i = 0; i < treeNodes.size() - 1; i++) {
//      if (treeNodes.get(i).val >= treeNodes.get(i + 1).val) {
//        return false;
//      }
//    }
//    return true;
//  }
//
//  public List<TreeNode> inOrderTraverse(TreeNode node) {
//    if (node == null) {
//      return new ArrayList<>();
//    }
//
//    List<TreeNode> inOrder = new ArrayList<>(inOrderTraverse(node.left));
//    inOrder.add(node);
//    inOrder.addAll(inOrderTraverse(node.right));
//
//    return inOrder;
//  }
}