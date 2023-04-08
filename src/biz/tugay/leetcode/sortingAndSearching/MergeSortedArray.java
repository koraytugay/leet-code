package biz.tugay.leetcode.sortingAndSearching;

// https://leetcode.com/problems/merge-sorted-array
public class MergeSortedArray {

  public static void main(String[] args) {
    MergeSortedArray mergeSortedArray = new MergeSortedArray();
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int[] nums2 = {2, 5, 6};
    mergeSortedArray.merge(nums1, 3, nums2, 3);
  }

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] sorted = new int[m + n];
    int i = 0, j = 0, k = 0;

    while (i < m || j < n) {
      if (i < m && j < n) {
        if (nums1[i] < nums2[j]) {
          sorted[k] = nums1[i];
          i++;
        } else {
          sorted[k] = nums2[j];
          j++;
        }
      } else if (i < m) {
        sorted[k] = nums1[i];
        i++;
      } else if (j < n) {
        sorted[k] = nums2[j];
        j++;
      }
      k++;
    }

    for (int idx = 0; idx < sorted.length; idx++) {
      nums1[idx] = sorted[idx];
    }
  }
}
