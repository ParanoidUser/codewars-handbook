import static java.util.stream.IntStream.range;
import static java.util.stream.Stream.of;

interface Solution {
  static String solve(String[] alarms) {
    int[] mins = of(alarms).sorted().map(a -> a.split(":")).mapToInt(u -> 60 * Integer.parseInt(u[0]) + Integer.parseInt(u[1])).toArray();
    int max = range(0, mins.length).map(i -> (i < mins.length - 1 ? mins[i + 1] : 1440 + mins[0]) - mins[i] - 1).max().orElse(0);
    return String.format("%02d:%02d", max / 60, max % 60);
  }
}