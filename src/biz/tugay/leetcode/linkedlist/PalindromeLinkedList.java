package biz.tugay.leetcode.linkedlist;

import java.util.LinkedList;

// https://leetcode.com/problems/palindrome-linked-list
public class PalindromeLinkedList {

  static class ListNode {

    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int x) {
      val = x;
    }
  }

  public boolean isPalindrome(ListNode head) {
    int size = 0;

    ListNode iterator = head;
    while (iterator != null) {
      size++;
      iterator = iterator.next;
    }

    if (size == 1) {
      return true;
    }

    LinkedList<Integer> integers = new LinkedList<>();

    // If the linked list has odd number of elements,
    // skip the one in the middle before starting to
    // remove from the collection
    boolean shouldSkipOne = size % 2 == 1;
    boolean didSkipOne = false;

    iterator = head;
    for (int i = 0; i < size; i++) {
      int currentValue = iterator.val;
      if (i < size / 2) {
        integers.add(currentValue);
      } else {
        if (shouldSkipOne && !didSkipOne) {
          didSkipOne = true;
        } else if (integers.removeLast() != currentValue) {
          return false;
        }
      }
      iterator = iterator.next;
    }

    return true;
  }

  public boolean isPalindromeWithoutExtraSpace(ListNode head) {
    int size = 0;

    ListNode i = head;
    while (i != null) {
      size++;
      i = i.next;
    }

    if (size == 1) {
      return true;
    }

    ListNode midNode = head;
    for (int j = 0; j < size / 2; j++) {
      midNode = midNode.next;
    }

    if (size % 2 == 1) {
      midNode = midNode.next;
      size = size - 1;
    }

    ListNode leftNode = head;
    ListNode rightNode;

    for (int j = 0; j < size / 2; j++) {
      rightNode = midNode;
      for (int k = 0; k < (size / 2) - j - 1; k++) {
        rightNode = rightNode.next;
      }
      if (leftNode.val != rightNode.val) {
        return false;
      }
      leftNode = leftNode.next;
    }

    return true;
  }
}
