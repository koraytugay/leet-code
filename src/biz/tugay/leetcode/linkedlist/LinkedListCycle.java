package biz.tugay.leetcode.linkedlist;

// https://leetcode.com/problems/linked-list-cycle
public class LinkedListCycle {

  static class ListNode {

    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int x) {
      val = x;
    }
  }

  public boolean hasCycle(ListNode head) {
    if (head == null) {
      return false;
    }

    int counter = 0;
    ListNode iterator = head;

    while (iterator.next != null) {
      ListNode visitedNode = head;
      for (int i = 0; i <= counter; i++) {
        if (iterator.next == visitedNode) {
          return true;
        }
        visitedNode = visitedNode.next;
      }
      iterator = iterator.next;
      counter++;
    }

    return false;
  }
}
