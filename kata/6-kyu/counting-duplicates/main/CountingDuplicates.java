import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

class CountingDuplicates {
  static int duplicateCount(String text) {
    return (int) text.toLowerCase().chars().boxed().collect(groupingBy(k -> k, counting()))
                     .values().stream().filter(n -> n > 1).count();
  }
}
