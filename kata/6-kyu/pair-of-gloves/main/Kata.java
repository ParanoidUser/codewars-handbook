import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Stream.of;

interface Kata {
  static int numberOfPairs(String[] gloves) {
    return (int) of(gloves).collect(groupingBy(identity(), counting())).values().stream().mapToLong(n -> n / 2).sum();
  }
}