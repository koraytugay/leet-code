package biz.tugay.leetcode.strings;

// https://leetcode.com/problems/reverse-string/
public class ReverseString {

  public void reverseString(char[] s) {
    int i = 0;
    int j = s.length - 1;
    while (j > i) {
      char temp = s[i];
      s[i] = s[j];
      s[j] = temp;
      j--;
      i++;
    }
  }
}
