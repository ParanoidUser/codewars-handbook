import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Stream.of;

interface ShortestPath {
  static String[] directions(String[] goal) {
    var stats = of(goal).collect(groupingBy(identity(), counting()));
    int y = (int) (stats.getOrDefault("N", 0L) - stats.getOrDefault("S", 0L));
    int x = (int) (stats.getOrDefault("E", 0L) - stats.getOrDefault("W", 0L));
    return x != 0 || y != 0  ? (
        "N".repeat(Math.max(0, y)) + "S".repeat(Math.max(0, -y)) +
        "E".repeat(Math.max(0, x)) + "W".repeat(Math.max(0, -x))
    ).split("") : new String[0];
  }
}