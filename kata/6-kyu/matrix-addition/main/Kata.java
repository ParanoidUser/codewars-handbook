import static java.util.stream.IntStream.range;

interface Kata {
  static int[][] matrixAddition(int[][] a, int[][] b) {
    range(0, a.length * a.length).forEach(i -> a[i / a.length][i % a.length] += b[i / a.length][i % a.length]);
    return a;
  }
}
