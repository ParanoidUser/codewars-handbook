import static java.util.stream.IntStream.range;

interface Kata {
  static int[] squareUp(int n) {
    return range(0, n).flatMap(x -> range(0, n).map(y -> y < n - x - 1 ? 0 : n - y)).toArray();
  }
}
