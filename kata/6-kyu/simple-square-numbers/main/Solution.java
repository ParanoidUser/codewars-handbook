import static java.util.stream.LongStream.range;

interface Solution {
  static long solve(int n) {
    return range(1, n).map(i -> i * i).filter(i -> Math.sqrt(i + (double) n) % 1 == 0).findFirst().orElse(-1);
  }
}