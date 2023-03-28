package biz.tugay.leetcode.array;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate
// Given an integer array nums, return true if any value appears at least twice in the array,
// and return false if every element is distinct.
public class ContainsDuplicate {

  public boolean containsDuplicate(int[] nums) {
    Set<Integer> seenNumbers = new HashSet<>();

    for (int num : nums) {
      if (seenNumbers.contains(num)) {
        return true;
      }
      seenNumbers.add(num);
    }

    return false;
  }
}
