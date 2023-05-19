import static java.util.stream.IntStream.range;

interface LatinSquares {
  static int[][] makeLatinSquare(int n) {
    return range(0, n).mapToObj(i -> range(0, n).map(j -> (j + i) % n + 1).toArray()).toArray(int[][]::new);
  }
}