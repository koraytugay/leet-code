package biz.tugay.leetcode.array;

import java.util.Arrays;

// https://leetcode.com/problems/missing-number/
public class MissingNumber {
  public int missingNumber(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != i) {
        return i;
      }
    }
    return nums.length;
  }
}
