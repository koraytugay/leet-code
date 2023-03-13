package biz.tugay.leetcode.array;

// https://leetcode.com/problems/move-zeroes
public class MoveZeros {

  public void moveZeroes(int[] nums) {
    int j = -1;
    outer:
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] != 0) {
        continue;
      }
      if (j == -1) {
        j = i + 1;
      }
      for (; j < nums.length; j++) {
        if (nums[j] != 0) {
          nums[i] = nums[j];
          nums[j] = 0;
          break;
        }
        if (j == nums.length - 1) {
          break outer;
        }
      }
    }
  }
}
