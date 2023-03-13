package biz.tugay.leetcode.strings;

// https://leetcode.com/problems/string-to-integer-atoi
public class StringToInteger {

  public int myAtoi(String s) {
    s = s.trim();

    if (s.length() == 0) {
      return 0;
    }

    if (s.length() == 1 && Character.isDigit(s.charAt(0))) {
      return Integer.parseInt(s);
    }

    if (s.length() == 1 && !Character.isDigit(s.charAt(0))) {
      return 0;
    }

    boolean isNegative = false;
    if (s.charAt(0) == '-') {
      isNegative = true;
      s = s.substring(1);

      if (!Character.isDigit(s.charAt(0))) {
        return 0;
      }
    }

    if (s.charAt(0) == '+') {
      isNegative = false;
      s = s.substring(1);

      if (!Character.isDigit(s.charAt(0))) {
        return 0;
      }
    }

    int i = 0;
    for (; i < s.length(); i++) {
      if (s.charAt(i) != '0') {
        break;
      }
    }

    s = s.substring(i);

    if (s.length() == 0) {
      return 0;
    }

    StringBuilder stringBuilder = new StringBuilder();
    for (int j = 0; j < s.length(); j++) {
      if (Character.isDigit(s.toCharArray()[j])) {
        stringBuilder.append(s.toCharArray()[j]);
        continue;
      }
      break;
    }

    if (stringBuilder.toString().length() == 0) {
      return 0;
    }

    if (!isNegative) {
      if (fitsIntMax(stringBuilder.toString())) {
        return Integer.parseInt(stringBuilder.toString());
      }
      return Integer.MAX_VALUE;
    }

    if (fitsIntMin(stringBuilder.toString())) {
      return Integer.parseInt("-".concat(stringBuilder.toString()));
    }
    return Integer.MIN_VALUE;
  }

  public boolean fitsIntMin(String s) {
    if (s.length() > "2147483648".length()) {
      return false;
    }
    if (s.length() < "2147483648".length()) {
      return true;
    }

    char[] inputChars = s.toCharArray();
    char[] integerMaxChars = "2147483648".toCharArray();

    for (int i = 0; i < "2147483648".length(); i++) {
      int inputChar = Integer.parseInt("" + inputChars[i]);
      int integerMaxChar = Integer.parseInt("" + integerMaxChars[i]);
      if (integerMaxChar == inputChar) {
        if (i == "2147483648".length() - 1) {
          return true;
        }
        continue;
      }
      return inputChar < integerMaxChar;
    }

    return false;
  }

  public boolean fitsIntMax(String s) {
    if (s.length() > "2147483647".length()) {
      return false;
    }
    if (s.length() < "2147483647".length()) {
      return true;
    }

    char[] inputChars = s.toCharArray();
    char[] integerMaxChars = "2147483647".toCharArray();

    for (int i = 0; i < "2147483647".length(); i++) {
      int inputChar = Integer.parseInt("" + inputChars[i]);
      int integerMaxChar = Integer.parseInt("" + integerMaxChars[i]);
      if (integerMaxChar == inputChar) {
        if (i == "2147483647".length() - 1) {
          return true;
        }
        continue;
      }
      return inputChar < integerMaxChar;
    }

    return false;
  }
}
