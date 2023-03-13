package biz.tugay.leetcode.array;

public class RotateImage {

  public static void main(String[] args) {
    RotateImage rotateImage = new RotateImage();
    int[][] matrix;

    matrix = new int[][]{
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

//    matrix = new int[][]{
//        {7, 4, 1},
//        {8, 5, 2},
//        {9, 6, 3}
//    };

    rotateImage.rotate(matrix);
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println("");
    }
  }

  public void rotate(int[][] matrix) {
    int len = matrix[0].length;

    int[][] result = new int[len][len];

    for (int i = 0; i < len; i++) {
      int[] row = matrix[i];
      int targetCol = (len - i);
      for (int j = 0; j < len; j++) {
        System.out.println(row[j]);
        System.out.println("target row:" + (j));
        System.out.println("target col:" + targetCol);
        result[j][targetCol] = row[j];
      }
    }
  }
}

// 0, 0 -> 0, 2
// 0, 2 -> 2, 2
// 2, 2 -> 2, 0
// 2, 0 -> 0, 0





// 0, 0 -> 0, 3
// 0, 3 -> 3, 3
// 3, 3 -> 3, 0
// 3, 0 -> 0, 0

// 0, 1 -> 1, 3
// 1, 3 -> 3, 2
// 3, 2 -> 2, 0
// 2, 0 -> 0, 1

// 0, 0
// 0, 3
// 3, 3
// 3, 0
// 0, 0

// 0, 1
// 1, 3
// 3, 2
// 2, 0
// 0, 1
