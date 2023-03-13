package biz.tugay.leetcode.strings;

// https://leetcode.com/problems/reverse-integer
public class ReverseInteger {

  public int reverse(int x) {
    String valueAsString = String.valueOf(x);

    boolean isNegative = false;
    if (x < 0) {
      isNegative = true;
      valueAsString = valueAsString.substring(1);
    }

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = valueAsString.length() - 1; i >= 0; i--) {
      stringBuilder.append(valueAsString.charAt(i));
    }

    String reversed = stringBuilder.toString();
    if (isNegative && fitsInIntegerMin(reversed)) {
      return Integer.parseInt("-" + reversed);
    }

    if (fitsInIntegerMax(reversed)) {
      return Integer.parseInt(reversed);
    }

    return 0;
  }

  public boolean fitsInIntegerMax(String value) {
    if (value.length() > "2147483647".length()) {
      return false;
    }
    if (value.length() < "2147483647".length()) {
      return true;
    }
    if (value.equals("2147483647")) {
      return true;
    }

    for (int i = 0; i < "2147483647".length(); i++) {
      if (value.charAt(i) > "2147483647".charAt(i)) {
        return false;
      }
    }

    return true;
  }

  public boolean fitsInIntegerMin(String value) {
    if (value.length() > "2147483648".length()) {
      return false;
    }
    if (value.length() < "2147483648".length()) {
      return true;
    }
    if (value.equals("2147483648")) {
      return true;
    }

    for (int i = 0; i < "2147483648".length(); i++) {
      if (value.charAt(i) < "2147483648".charAt(i)) {
        return true;
      }

      if (value.charAt(i) > "2147483648".charAt(i)) {
        return false;
      }
    }

    return true;
  }
}
