import static java.util.stream.IntStream.rangeClosed;

interface Kata {
  static int[] kidoCount(int n) {
    return rangeClosed(0, n).filter(i -> i % 2 > 0).toArray();
  }
}
