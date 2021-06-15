interface Kata {
  static String[][] matrixSquareUp(int b) {
    var matrix = new String[b][b];
    for (var i = 0; i < b; i++) {
      for (int j = b - 1; j >= 0; j--) {
        matrix[i][j] = i + j + 1 < b ? "x" : b - j + "";
      }
    }
    return matrix;
  }
}
