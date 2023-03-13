package biz.tugay.leetcode.array;

// https://leetcode.com/problems/rotate-array
public class RotateArray {

  public void rotate(int[] nums, int k) {
    if (nums.length == 1 || k == 0 || k == nums.length) {
      return;
    }

    int counter = 0;
    int startIndex = 0;

    while (counter != nums.length) {
      int nextIndex = (startIndex + k) % nums.length;
      int tempOne = nums[startIndex];
      while (nextIndex != startIndex) {
        int tempTwo = nums[nextIndex];
        nums[nextIndex] = tempOne;
        tempOne = tempTwo;
        nextIndex = (nextIndex + k) % nums.length;
        counter++;
      }
      nums[nextIndex] = tempOne;
      counter++;
      startIndex++;
    }
  }
}
