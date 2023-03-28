package biz.tugay.leetcode.array;

// https://leetcode.com/problems/move-zeroes
public class MoveZeros {

  public void moveZeroes(int[] nums) {
    for (int slow = 0, fast = 0; slow < nums.length - 1; slow++) {
      if (nums[slow] == 0) {
        while (nums[fast] == 0) {
          fast++;
          if (fast == nums.length) {
            return;
          }
        }
        nums[slow] = nums[fast];
        nums[fast] = 0;
      }
      if (fast == slow) {
        fast++;
      }
    }
  }
}
