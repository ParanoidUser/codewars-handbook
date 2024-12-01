import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

interface Letters {
  static String search(String line) {
    return range(65, 91).mapToObj(c -> line.toUpperCase().indexOf(c) < 0 ? "0" : "1").collect(joining());
  }
}