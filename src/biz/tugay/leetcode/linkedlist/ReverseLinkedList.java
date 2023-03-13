package biz.tugay.leetcode.linkedlist;

// https://leetcode.com/problems/reverse-linked-list
public class ReverseLinkedList {

  static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return head;
    }

    if (head.next == null) {
      return head;
    }

    ListNode i = head;
    ListNode j = head.next;
    head.next = null;

    while (true) {
      ListNode k = j.next;
      j.next = i;

      if (k == null) {
        return j;
      }

      i = j;
      j = k;
    }
  }
}
