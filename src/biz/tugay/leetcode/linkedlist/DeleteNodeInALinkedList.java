package biz.tugay.leetcode.linkedlist;

// https://leetcode.com/problems/delete-node-in-a-linked-list
public class DeleteNodeInALinkedList {

  static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }
}
