import static java.util.stream.IntStream.iterate;

interface Solution {
  static int[] generateRange(int min, int max, int step) {
    return iterate(min, i -> i <= max, i -> i + step).toArray();
  }
}