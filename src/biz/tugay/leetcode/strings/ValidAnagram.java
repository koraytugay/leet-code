package biz.tugay.leetcode.strings;

// https://leetcode.com/problems/valid-anagram
public class ValidAnagram {

  public boolean isAnagram(String s, String t) {
    int[] charCount = new int['z' - 'a' + 1];

    for (char character : s.toCharArray()) {
      charCount[character - 'a']++;
    }

    for (char character : t.toCharArray()) {
      charCount[character - 'a']--;
    }

    for (int i : charCount) {
      if (i != 0) {
        return false;
      }
    }

    return true;
  }
}
