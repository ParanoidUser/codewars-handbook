import static java.util.stream.IntStream.rangeClosed;

interface Kata {
  static int[] generateIntegers(int n) {
    return rangeClosed(0, n).toArray();
  }
}