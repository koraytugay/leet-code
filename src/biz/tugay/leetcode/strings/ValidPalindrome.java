package biz.tugay.leetcode.strings;

// https://leetcode.com/problems/valid-palindrome
public class ValidPalindrome {

  public boolean isPalindrome(String s) {
    int i = 0;
    int j = s.length() - 1;

    while (j > i) {
      char chari = s.charAt(i);
      char charj = s.charAt(j);

      if (!Character.isAlphabetic(chari) && !Character.isDigit(chari)) {
        i++;
        continue;
      }

      if (!Character.isAlphabetic(charj) && !Character.isDigit(charj)) {
        j--;
        continue;
      }

      if (Character.toLowerCase(chari) != Character.toLowerCase(charj)) {
        return false;
      }

      i++;
      j--;
    }

    return true;
  }
}
