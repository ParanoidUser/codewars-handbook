import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.of;

interface Solution {
  static int sumGroups(int[] arr) {
    return of(arr).mapToObj(i -> i % 2 + "").collect(joining())
        .replaceAll("1(11)*", "1").replaceAll("(0|11)+", "0").length();
  }
}