import static java.util.stream.IntStream.range;

interface Solution {
  static int[] extraPerfect(int number) {
    return range(0, ++number).filter(i -> i % 2 != 0).toArray();
  }
}
