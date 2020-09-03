import static java.util.stream.IntStream.rangeClosed;
import static java.util.stream.Stream.of;

interface PointsInSegments {
  static int[] segments(int m, int[][] arr) {
    return rangeClosed(0, m).filter(i -> of(arr).allMatch(s -> i < s[0] || i > s[1])).toArray();
  }
}