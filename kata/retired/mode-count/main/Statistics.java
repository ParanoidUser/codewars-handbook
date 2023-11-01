import static java.util.Collections.max;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.IntStream.of;

interface Statistics {
  static int modeCount(int[] data) {
    var count = of(data).boxed().collect(groupingBy(identity(), counting())).values();
    return (int) count.stream().filter(l -> max(count).equals(l)).count();
  }
}
