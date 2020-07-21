import static java.util.stream.DoubleStream.iterate;

interface Kata {
  static int consecutiveSum(int num) {
    return (int) iterate(1, i -> i + 1)
        .map(i -> num / i - i / 2 + .5)
        .takeWhile(n -> n > 0)
        .filter(n -> n == (int) n)
        .count();
  }
}