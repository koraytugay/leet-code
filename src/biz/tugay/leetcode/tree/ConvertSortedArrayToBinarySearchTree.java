package biz.tugay.leetcode.tree;

import java.util.Arrays;

// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree
public class ConvertSortedArrayToBinarySearchTree {

  static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
      this.val = val;
    }
  }

  public TreeNode sortedArrayToBST(int[] nums) {
    if (nums == null || nums.length == 0) {
      return null;
    }

    int val = nums[nums.length / 2];

    TreeNode node = new TreeNode(val);
    int[] left = Arrays.stream(nums, 0, nums.length / 2).toArray();
    int[] right = Arrays.stream(nums, 1 + nums.length / 2, nums.length).toArray();

    node.left = sortedArrayToBST(left);
    node.right = sortedArrayToBST(right);

    return node;
  }
}
