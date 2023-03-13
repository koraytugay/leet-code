package biz.tugay.leetcode.array;

// https://leetcode.com/problems/valid-sudoku
public class ValidSudoku {

  public boolean isValidSudoku(char[][] board) {
    char[] section = new char[9];

    int[][] midPoints = new int[][]{
        {1, 1}, {1, 4}, {1, 7},
        {4, 1}, {4, 4}, {4, 7},
        {7, 1}, {7, 4}, {7, 7},
    };

    int counter = 0;
    for (int[] midPoint : midPoints) {
      for (int i = -1; i < 2; i++) {
        for (int j = -1; j < 2; j++) {
          section[counter] = board[midPoint[0] + i][midPoint[1] + j];
          counter++;
        }
      }
      if (!isSectionValid(section)) {
        return false;
      }
      counter = 0;
    }

    for (int i = 0; i < 9; i++) {
      char[] row = board[i];
      if (!isSectionValid(row)) {
        return false;
      }
    }

    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        section[j] = board[j][i];
      }
      if (!isSectionValid(section)) {
        return false;
      }
    }

    return true;
  }

  public boolean isSectionValid(char[] section) {
    boolean[] seen = new boolean[9];

    for (char character : section) {
      if ('.' == character) {
        continue;
      }
      if (seen[character - 49]) {
        return false;
      }
      seen[character - 49] = true;
    }

    return true;
  }
}
