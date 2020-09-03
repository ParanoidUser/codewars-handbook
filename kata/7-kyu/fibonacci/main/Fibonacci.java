import static java.util.stream.Stream.iterate;

interface Fibonacci {
  static long fib(int n) {
    return iterate(new long[] {1, 1}, i -> new long[] {i[1], i[0] + i[1]})
        .limit(n).reduce((x, y) -> y).orElse(new long[1])[0];
  }
}
