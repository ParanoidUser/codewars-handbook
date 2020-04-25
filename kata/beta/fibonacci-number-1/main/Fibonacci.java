import static java.util.stream.Stream.iterate;

interface Fibonacci {
  static int fib(int n) {
    return iterate(new int[] {1, 1}, i -> new int[] {i[1], i[0] + i[1]}).limit(n).reduce((x, y) -> y).orElse(new int[1])[0];
  }
}
