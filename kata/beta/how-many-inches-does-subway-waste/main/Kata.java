import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Stream.of;

interface Kata {
  static int subwayWastage(String... orders) {
    return of(orders).collect(groupingBy(identity(), counting())).values()
        .stream().reduce(0L, (s, n) -> s + n % 2 * 6).intValue();
  }
}