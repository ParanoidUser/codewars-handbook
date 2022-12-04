import static java.util.stream.Stream.iterate;

interface Solution {
  static long padovan(long n) {
    return iterate(new long[] {1, 1, 1}, i -> new long[] {i[1], i[2], i[0] + i[1]})
        .limit(n + 1).reduce((x, y) -> y).orElse(new long[1])[0];
  }
}
