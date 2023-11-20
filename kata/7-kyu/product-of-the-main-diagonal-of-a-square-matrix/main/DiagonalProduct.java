import static java.util.stream.IntStream.range;

interface DiagonalProduct {
  static int ReturnProduct(int[][] matrix) {
    return range(0, matrix.length).reduce(1, (r, i) -> r * matrix[i][i]);
  }
}