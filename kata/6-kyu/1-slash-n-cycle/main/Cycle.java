import static java.util.stream.IntStream.iterate;

interface Cycle {
  static int cycle(int n) {
    return n % 2 > 0 && n % 5 > 0 ? (int) (iterate(10 % n, i -> i > 1, i -> 10 * i % n).count() + 1) : -1;
  }
}
