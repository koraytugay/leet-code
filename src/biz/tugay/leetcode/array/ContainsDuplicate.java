package biz.tugay.leetcode.array;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate
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
