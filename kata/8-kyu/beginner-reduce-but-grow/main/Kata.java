import static java.util.stream.IntStream.of;

interface Kata {
  static int grow(int[] x) {
    return of(x).reduce(1, (a, b) -> a * b);
  }
}
