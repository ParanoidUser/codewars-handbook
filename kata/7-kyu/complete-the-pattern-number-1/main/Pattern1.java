import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.rangeClosed;

interface Pattern1 {
  static String pattern(int n) {
    return rangeClosed(1, n).mapToObj(i -> ("" + i).repeat(i)).collect(joining("\n"));
  }
}