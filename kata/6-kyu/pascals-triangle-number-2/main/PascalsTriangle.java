interface PascalsTriangle {
  static int[][] pascal(int depth) {
    int[][] triangle = new int[depth][];
    for (int i = 0; i < depth; i++) {
      triangle[i] = new int[i + 1];
      triangle[i][0] = triangle[i][i] = 1;
      for (int j = 1; j < i; j++) {
        triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];
      }
    }
    return triangle;
  }
}
