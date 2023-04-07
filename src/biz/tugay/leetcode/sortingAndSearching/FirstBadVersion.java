package biz.tugay.leetcode.sortingAndSearching;

// https://leetcode.com/problems/first-bad-version/submissions
class VersionControl {

  boolean isBadVersion(int version) {
    return version >= 4;
  }
}

public class FirstBadVersion extends VersionControl {

  public int firstBadVersion(int n) {
    if (isBadVersion(n) && !isBadVersion(n - 1)) {
      return n;
    }

    int min = 0;
    int max = n;
    int mid = min + (max - min) / 2;

    while (!(isBadVersion(mid) && !isBadVersion(mid - 1))) {
      if (!isBadVersion(mid)) {
        min = mid;
      } else {
        max = mid;
      }
      mid = min + (max - min) / 2;
    }

    return mid;
  }
}
