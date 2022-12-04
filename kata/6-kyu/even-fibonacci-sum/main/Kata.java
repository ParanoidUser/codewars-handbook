import static java.util.stream.Stream.iterate;

interface Kata {
  static long fibonacci(long max) {
    return iterate(new long[]{1, 1}, i -> i[0] < max, i -> new long[]{i[1], i[0] + i[1]})
        .map(m -> m[0] % 2 == 0 ? m[0] : 0).reduce(Long::sum).orElse(0L);
  }
}