package biz.tugay.leetcode.strings;

// https://leetcode.com/problems/longest-common-prefix
public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {
    StringBuilder longestCommonPrefix = new StringBuilder();
    int counter = 0;
    while (true) {
      Character current = null;
      for (String str : strs) {
        if (str.length() == counter) {
          return longestCommonPrefix.toString();
        }

        char character = str.charAt(counter);
        if (current == null) {
          current = character;
          continue;
        }

        if (current != character) {
          return longestCommonPrefix.toString();
        }
      }

      if (current != null) {
        longestCommonPrefix.append(current);
      }
      counter++;
    }
  }
}
