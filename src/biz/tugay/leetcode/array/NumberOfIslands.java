package biz.tugay.leetcode.array;

// https://leetcode.com/problems/number-of-islands
public class NumberOfIslands {

  public int numIslands(char[][] grid) {
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    int islandCount = 0;

    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (!visited[i][j]) {
          if (grid[i][j] == '1') {
            islandCount++;
            spread(grid, visited, i, j);
          }
        }
      }
    }

    return islandCount;
  }

  public void spread(char[][] grid, boolean[][] visited, int i, int j) {
    if (visited[i][j]) {
      return;
    }

    if (grid[i][j] == '0') {
      return;
    }

    visited[i][j] = true;

    if (j + 1 < grid[0].length) {
      spread(grid, visited, i, j + 1);
    }

    if (j - 1 >= 0) {
      spread(grid, visited, i, j - 1);
    }

    if (i + 1 < grid.length) {
      spread(grid, visited, i + 1, j);
    }

    if (i - 1 >= 0) {
      spread(grid, visited, i - 1, j);
    }
  }
}
