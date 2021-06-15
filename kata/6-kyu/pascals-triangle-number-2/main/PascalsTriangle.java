interface PascalsTriangle {
  static int[][] pascal(int depth) {
    var triangle = new int[depth][];
    for (var i = 0; i < depth; i++) {
      triangle[i] = new int[i + 1];
      triangle[i][0] = triangle[i][i] = 1;
      for (var j = 1; j < i; j++) {
        triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];
      }
    }
    return triangle;
  }
}
