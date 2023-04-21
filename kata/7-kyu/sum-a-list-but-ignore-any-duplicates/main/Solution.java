import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.IntStream.of;

interface Solution {
  static int sumNoDuplicates(int[] arr) {
    return of(arr).boxed().collect(groupingBy(i -> i, counting())).entrySet()
            .stream().mapToInt(e -> e.getValue() > 1 ? 0 : e.getKey()).sum();
  }
}