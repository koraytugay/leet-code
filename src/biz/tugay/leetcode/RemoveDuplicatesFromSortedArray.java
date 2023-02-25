package biz.tugay.leetcode;

// Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArray {

  public int removeDuplicates(int[] nums) {
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
      if (nums[i] != nums[j]) {
        nums[i + 1] = nums[j];
        i++;
      }
    }
    int length =  i + 1;
    return length;
  }
}
