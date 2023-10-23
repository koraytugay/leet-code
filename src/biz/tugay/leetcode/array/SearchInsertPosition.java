package biz.tugay.leetcode.array;

// https://leetcode.com/problems/search-insert-position
public class SearchInsertPosition {

  public int searchInsert(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    int i = low + (high - low) / 2;

    while (true) {
      if (nums[i] == target) {
        return i;
      }
      if (nums[i] < target) {
        if (i + 1 == nums.length) {
          return i + 1;
        }
        if (nums[i + 1] > target) {
          return i + 1;
        }
      }
      if (nums[i] > target) {
        if (i == 0) {
          return 0;
        }
        if (nums[i - 1] < target) {
          return i;
        }
      }
      if (nums[i] > target) {
        high = i - 1;
      } else {
        low = i + 1;
      }
      i = low + (high - low) / 2;
    }
  }
}
