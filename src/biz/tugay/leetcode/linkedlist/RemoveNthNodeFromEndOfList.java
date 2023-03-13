package biz.tugay.leetcode.linkedlist;

public class RemoveNthNodeFromEndOfList {

  static class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode i = head;
    ListNode j = head;

    for (int k = 0; k < n; k++) {
      if (j.next == null) {
        return head.next;
      }
      j = j.next;
    }

    while (j.next != null) {
      j = j.next;
      i = i.next;
    }

    i.next = i.next.next;
    return head;
  }

}
