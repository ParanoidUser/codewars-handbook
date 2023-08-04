interface Matrix {
  static int determinant(int[][] matrix) {
    return minor(matrix, 0, new boolean[matrix.length]);
  }

  private static int minor(int[][] m, int depth, boolean[] visited) {
    if (depth == m.length) {
      return 1;
    }
    int sum = 0;
    int sign = 1;
    for (int i = 0; i < m.length; i++) {
      if (!visited[i]) {
        visited[i] = true;
        sum += sign * m[depth][i] * minor(m, depth + 1, visited);
        visited[i] = false;
        sign = -sign;
      }
    }
    return sum;
  }
}