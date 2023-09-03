import static java.util.stream.IntStream.iterate;

interface Multiples {
  static int[] find(int base, int limit) {
    return iterate(base, i -> i <= limit, i -> i + base).toArray();
  }
}