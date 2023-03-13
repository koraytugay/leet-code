package biz.tugay.leetcode.linkedlist;

// https://leetcode.com/problems/merge-two-sorted-lists
public class MergeTwoSortedLists {

  static class ListNode {

    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int x) {
      val = x;
    }
  }


  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null && list2 == null) {
      return null;
    }

    ListNode head;
    ListNode curr;

    if (list1 == null) {
      return list2;
    }

    if (list2 == null) {
      return list1;
    }

    if (list1.val < list2.val) {
      head = list1;
      list1 = list1.next;
    } else {
      head = list2;
      list2 = list2.next;
    }

    curr = head;

    while (true) {
      if (list1 != null && list2 != null) {
        if (list1.val < list2.val) {
          curr.next = list1;
          list1 = list1.next;
        } else {
          curr.next = list2;
          list2 = list2.next;
        }
        curr = curr.next;
        continue;
      }

      curr.next = list1 == null ? list2 : list1;
      break;
    }

    return head;
  }
}
