package biz.tugay.leetcode.strings;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
public class StrStr {

  public int strStr(String haystack, String needle) {
    if (needle.length() > haystack.length()) {
      return -1;
    }

    if (needle.equals(haystack)) {
      return 0;
    }

    for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
      if (haystack.charAt(i) == needle.charAt(0)) {
        for (int j = 0; j < needle.length(); j++) {
          if (needle.charAt(j) != haystack.charAt(i + j)) {
            break;
          }
          if (j == needle.length() - 1) {
            return i;
          }
        }
      }
    }
    return -1;
  }
}
