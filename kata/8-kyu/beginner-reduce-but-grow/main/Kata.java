import static java.util.stream.IntStream.of;

class Kata {
  static int grow(int[] x) {
    return of(x).reduce(1, (a, b) -> a * b);
  }
}
