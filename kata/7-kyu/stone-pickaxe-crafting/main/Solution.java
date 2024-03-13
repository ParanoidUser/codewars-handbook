import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Stream.of;

interface Solution {
  static int stonePick(String[] arr) {
    var m = of(arr).collect(groupingBy(identity(), counting()));
    return (int) Math.min(2 * m.getOrDefault("Wood", 0L) + m.getOrDefault("Sticks", 0L) / 2, m.getOrDefault("Cobblestone", 0L) / 3);
  }
}