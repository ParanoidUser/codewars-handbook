import static java.util.Comparator.reverseOrder;
import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface AscendDescend {
  static String ascendDescend(int length, int min, int max) {
    var s = range(min, max + 1).mapToObj(i -> i + "").collect(joining())
          + range(min + 1, max).boxed().sorted(reverseOrder()).map(i -> i + "").collect(joining());
    return s.isEmpty() ? s : s.repeat(length / s.length() + 1).substring(0, length);
  }
}