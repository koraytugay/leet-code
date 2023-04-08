package biz.tugay.leetcode.sortingAndSearching;

// https://leetcode.com/problems/merge-sorted-array
public class MergeSortedArray {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int k = (m + n) - 1;
    m = m - 1;
    n = n - 1;
    for (int idx = k; idx >= 0; idx--) {
      if (n == -1) {
        break;
      }
      if (m != -1) {
        if (nums1[m] > nums2[n]) {
          nums1[k] = nums1[m];
          m--;
        } else {
          nums1[k] = nums2[n];
          n--;
        }
      } else {
        nums1[k] = nums2[n];
        n--;
      }
      k--;
    }
  }
}
