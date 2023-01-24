import static java.util.stream.IntStream.rangeClosed;

interface Kata {
  static int[] generateIntegers(int m, int n) {
    return rangeClosed(m, n).toArray();
  }
}