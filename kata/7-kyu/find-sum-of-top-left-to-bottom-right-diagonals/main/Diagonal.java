import static java.util.stream.IntStream.range;

interface Diagonal {
  static int diagonalSum(int[][] matrix) {
    return range(0, matrix.length).map(i -> matrix[i][i]).sum();
  }
}
